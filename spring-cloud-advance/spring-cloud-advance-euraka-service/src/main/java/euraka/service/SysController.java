package euraka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysController {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private DiscoveryClient client;

	@RequestMapping("/say")
	public String home() {
		ServiceInstance serviceInstance = client.getLocalServiceInstance();
		System.out.println(serviceInstance.getHost() + ","
				+ serviceInstance.getPort() + ","
				+ serviceInstance.getServiceId());
		return "Hello world";
	}
}