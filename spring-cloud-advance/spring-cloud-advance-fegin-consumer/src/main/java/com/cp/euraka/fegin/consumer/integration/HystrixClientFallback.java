package com.cp.euraka.fegin.consumer.integration;

import org.springframework.stereotype.Component;

@Component
class HystrixClientFallback implements ServiceCallBackClient {

	@Override
	public String home() {
		// TODO Auto-generated method stub
		return "error";
	}

}