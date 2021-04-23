package com.xdcplus.resource.basic.service.impl;

import com.xdcplus.customerorder.basic.entity.ChargeType;
import com.xdcplus.customerorder.basic.entity.Customer;
import com.xdcplus.customerorder.basic.entity.PaymentTerms;
import com.xdcplus.customerorder.basic.entity.PriceTerms;
import com.xdcplus.customerorder.basic.service.ChargeTypeService;
import com.xdcplus.customerorder.basic.service.CustomerService;
import com.xdcplus.customerorder.basic.service.PaymentTermsService;
import com.xdcplus.customerorder.basic.service.PriceTermsService;
import com.xdcplus.model.dto.cabinetel.CabinetelDTO;
import com.xdcplus.model.dto.cabinetel.HistoryDTO;
import com.xdcplus.model.dto.cabinetel.QueryDTO;
import com.xdcplus.resource.basic.dto.KeywordDTO;
import com.xdcplus.resource.basic.entity.Cabinet;
import com.xdcplus.resource.basic.mapper.CabinetExtMapper;
import com.xdcplus.resource.basic.mapper.CabinetMapper;
import com.xdcplus.resource.basic.service.CabinetMonitorService;
import com.xdcplus.resource.basic.service.CabinetService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xdcplus.resource.basic.vo.CabinetByKeywordVO;
import com.xdcplus.resource.basic.vo.CabinetByShowVO;
import com.xdcplus.utils.exception.CustomException;
import com.xdcplus.utils.other.ListUtil;
import com.xdcplus.utils.string.StringUtil;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.SneakyThrows;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.dubbo.config.annotation.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fish
 * @since 2021-04-12
 */
//@GlobalTransactional(rollbackFor = Exception.class)
@Service(version = "1.0.0")
public class CabinetServiceImpl extends ServiceImpl<CabinetMapper, Cabinet> implements CabinetService {

    protected static final Integer CON_EB1_CUSTOMER_ID = 2;
    protected static final Integer CON_EB2_CUSTOMER_ID = 1;

    @Autowired
    CabinetMapper cabinetMapper;

    @Reference(version = "1.0.0")
    PriceTermsService priceTermsService;

    @Reference(version = "1.0.0")
    PaymentTermsService paymentTermsService;

    @Reference(version = "1.0.0")
    CustomerService customerService;

    @Reference(version = "1.0.0")
    ChargeTypeService chargeTypeService;

    @Autowired
    CabinetExtMapper cabinetExtMapper;

    @Autowired
    CabinetMonitorService cabinetMonitorService;

    @Override
    public Map<Integer, CabinetByKeywordVO> selectMapCabinets(KeywordDTO keywordDTO) {
        HashMap<Integer, CabinetByKeywordVO> map = new HashMap<>(16);

        List<CabinetByKeywordVO> cabinets = cabinetMapper.selectByKeyword(keywordDTO);
        for (int i = 0; i <= cabinets.size() - 1; i++) {
            map.put(cabinets.get(i).getId(), cabinets.get(i));
        }

        return map;
    }

    @Override
    public List<CabinetelDTO> selectCabinetelDTOsByQueryDTO(QueryDTO queryDTO) {
        if (queryDTO.getCustomerId() != null) {
            if (queryDTO.getCustomerId().equals(CON_EB1_CUSTOMER_ID) || queryDTO.getCustomerId().equals(CON_EB2_CUSTOMER_ID)) {
                queryDTO.setCustomerId(null);
            }
        }
        if (queryDTO.getMonitorClassify() == null) {
            queryDTO.setMonitorClassify("电流");
        }
        if (!StringUtil.isEmpty(queryDTO.getCabinetNumber())) {
            queryDTO.setCabinetNumber("%" + queryDTO.getCabinetNumber() + "%");
        }
        List<CabinetelDTO> cabinetelDTOS = cabinetMapper.selectCabinetelDTOs(queryDTO);
        if ("cabinet_ext".equals(queryDTO.getArithmetic())) {
            List<CabinetelDTO> cabinetelDTOSExt = cabinetExtMapper.selectCabinetelDTOsByQueryDTO(queryDTO);
            cabinetelDTOS.addAll(cabinetelDTOSExt);
        }

        combineChargerTypeAndCustomer(cabinetelDTOS);

        return cabinetelDTOS;
    }

    @Override
    public List<CabinetelDTO> selectCabinetelDTOsOnlySByQueryDTOAndDatacenterId(QueryDTO queryDTO) throws CustomException {
        if (queryDTO.getDatacenterId() == null) {
            throw new CustomException("datacenterId not found");
        }
        queryDTO.setCabinetNumber("S-%");
        if (queryDTO.getCustomerId() != null) {
            if (queryDTO.getCustomerId().equals(CON_EB1_CUSTOMER_ID) || queryDTO.getCustomerId().equals(CON_EB2_CUSTOMER_ID)) {
                queryDTO.setCustomerId(null);
            }
        }
        if (queryDTO.getMonitorClassify() == null) {
            queryDTO.setMonitorClassify("电流");
        }
        List<CabinetelDTO> cabinetelDTOS = cabinetMapper.selectCabinetelDTOs(queryDTO);
        combineChargerTypeAndCustomer(cabinetelDTOS);

        return cabinetelDTOS;
    }

    @Override
    public List<CabinetelDTO> selectCabinetelDTOsOnlySByQueryDTO(QueryDTO queryDTO) throws CustomException {
        queryDTO.setCabinetNumber("S-%");
        if (queryDTO.getCustomerId() != null) {
            if (queryDTO.getCustomerId().equals(CON_EB1_CUSTOMER_ID) || queryDTO.getCustomerId().equals(CON_EB2_CUSTOMER_ID)) {
                queryDTO.setCustomerId(null);
            }
        }
        if (queryDTO.getMonitorClassify() == null) {
            queryDTO.setMonitorClassify("电流");
        }
        List<CabinetelDTO> cabinetelDTOS = cabinetMapper.selectCabinetelDTOs(queryDTO);
        if ("cabinet_ext".equals(queryDTO.getArithmetic())) {
            Map<Integer, List<HistoryDTO>> historyDTOMap = cabinetMonitorService.getCabinetIdHistoryDTO(queryDTO);
            List<HistoryDTO> historyDTOS;
            List<CabinetelDTO> cabinetelDTOSExts = cabinetExtMapper.selectCabinetelDTOsByQueryDTO(queryDTO);
            for (CabinetelDTO cabinetelDTOSExt : cabinetelDTOSExts) {
                if (cabinetelDTOSExt.getCabinetId() != null) {
                    historyDTOS = historyDTOMap.get(cabinetelDTOSExt.getCabinetId());
                    cabinetelDTOSExt.setHistoryDTOS(historyDTOS);
                }
            }
            cabinetelDTOS.addAll(cabinetelDTOSExts);
        }

        combineChargerTypeAndCustomer(cabinetelDTOS);

        return cabinetelDTOS;
    }

    @Override
    public CabinetByShowVO showCabinet(Integer id) {
        CabinetByShowVO cabinetByShowVO = cabinetMapper.showCabinet(id);

        return cabinetByShowVO;
    }

    @SneakyThrows
    @GlobalTransactional(rollbackFor = Exception.class)
    @Override
    public void insert(Cabinet cabinet) {
        ChargeType chargeType=new ChargeType();
        chargeType.setName("test111");
        chargeTypeService.insert(chargeType);
//        try {
            throw new Exception("error");
//        } catch (Exception e) {
////            e.printStackTrace();
//        }
//        cabinetMapper.insert(cabinet);
//        return false;
    }

    private void combineChargerTypeAndCustomer(List<CabinetelDTO> cabinetelDTOS) {
        Map<Integer, ChargeType> chargeTypeMap = chargeTypeService.getChargeTypes();
        Map<Integer, Customer> customerMap = customerService.getCustomers();
        if (ListUtil.isNotEmpty(cabinetelDTOS)) {
            ChargeType chargeType;
            Customer customer;
            for (CabinetelDTO cabinetelDTO : cabinetelDTOS) {
                chargeType = chargeTypeMap.get(cabinetelDTO.getChargeTypeId());
                if (chargeType != null) {
                    cabinetelDTO.setChargeTypeName(chargeType.getName());
                }
                if (cabinetelDTO.getPriceTermsId() != null) {
                    PriceTerms priceTerms = priceTermsService.getById(cabinetelDTO.getPriceTermsId());
                    if (priceTerms != null) {
                        cabinetelDTO.setPriceTermsName(priceTerms.getName());
                    }
                }
                if (cabinetelDTO.getPaymentTermsId() != null) {
                    PaymentTerms paymentTerms = paymentTermsService.getById(cabinetelDTO.getPaymentTermsId());
                    if (paymentTerms != null) {
                        cabinetelDTO.setPaymentTermsName(paymentTerms.getName());
                    }
                }
                if (cabinetelDTO.getCustomerId() != null) {
                    customer = customerMap.get(cabinetelDTO.getCustomerId());
                    if (customer != null) {
                        cabinetelDTO.setCustomerCode(customer.getCode());
                        cabinetelDTO.setCustomerName(customer.getFullName());
                    }
                }
            }
        }
    }

}
