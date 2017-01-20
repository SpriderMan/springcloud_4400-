package com.cp.euraka.fegin.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cp.euraka.fegin.consumer.integration.ServiceCallBackClient;

@RestController
public class Controller {
	@Autowired
	private ServiceCallBackClient computeClient;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return computeClient.home();
	}
}