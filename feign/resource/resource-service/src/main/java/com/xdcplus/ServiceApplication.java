package com.xdcplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**   
 * @Description:  [SpringCloudAlibaba提供者启动类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
//@MapperScan(basePackages = "com.pjqdyd.mapper")
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

}
