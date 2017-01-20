package com.cp.euraka.fegin.consumer.integration;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "sys-service-A", fallback = HystrixClientFallback.class)
public interface ServiceCallBackClient {
	@RequestMapping(method = RequestMethod.GET, value = "/say")
	String home();
}