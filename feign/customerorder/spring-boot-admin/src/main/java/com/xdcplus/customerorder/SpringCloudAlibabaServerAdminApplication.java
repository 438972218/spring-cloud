package com.xdcplus.customerorder;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**   
 * @Description:  [SpringCloudAlibaba提供者启动类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@EnableDiscoveryClient
@SpringBootApplication
@EnableAdminServer
public class SpringCloudAlibabaServerAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaServerAdminApplication.class, args);
    }

}
