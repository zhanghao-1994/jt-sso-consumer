package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class RunAppJtSsoFeign {
	
	public static void main(String[] args) {
		SpringApplication.run(RunAppJtSsoFeign.class, args);
	}
	
}
