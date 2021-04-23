package com.xdcplus.resource.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author fish
 * @since 2021-04-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("datacenter")
public class Datacenter implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String fullName;

    private String address;

    private String emergencyCall;

    private Integer administratorId;

    private Integer managerId;

    private Integer assetAdminId;

    private String longitude;

    private String latitude;

    /**
     * datacenter:自有/合作数据中心,popsite:传输pop点.customer_dc:客户机房
     */
    private String type;

    private Boolean enabled;

    private Integer createById;

    private LocalDateTime updateTime;

    private LocalDateTime createTime;


}
