package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/secure")
@Log4j
public class SecureController {
	
	@GetMapping("/all")
	@ResponseBody
	public String doAll() {
		
		log.info("secure all method");
		return "모두 접근 가능 경로";
	}
	
	@GetMapping("/member")
	@ResponseBody
	public String doMember() {
		log.info("secure member method");
		
		return "멤버만 접근 가능 경로";
	}
}
