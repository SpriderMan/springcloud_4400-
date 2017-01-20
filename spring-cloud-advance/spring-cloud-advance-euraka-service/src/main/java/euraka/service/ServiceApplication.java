package euraka.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ServiceApplication.class).web(true).run(
				args);
	}
}