package com.saasschoolshopmanage.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saasschoolshopmanage.service.TestService;

@Controller
@RequestMapping(value = "/jump")
public class TestJumpPage {
	@Resource
	private TestService testService;

	// @PostMapping("/jump1")

	@RequestMapping(value = "/jump1")
	public String testJumo() {
		System.out.println(" get testJumo success!!");
		testService.addTest();
		return "page2";
	}

}
