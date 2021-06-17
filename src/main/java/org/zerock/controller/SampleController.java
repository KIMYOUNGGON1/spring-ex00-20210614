package org.zerock.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.SampleDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
	@RequestMapping("/B")
	public void basic() {
		log.info("basic........");
	}
	
	@RequestMapping(value = "/basicGet", method = {RequestMethod.GET, RequestMethod.POST})
	public void basicGet() {
		
		log.info("basic get......");
	}

	
	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		
		log.info("basic get2......");
		
	}
	
	@RequestMapping({"/basic3", "/basic4"})
	public void basic3() {
		log.info("basic3, basic4........");
	}
	
	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids")ArrayList<String> ids) {
		log.info("ids: " + ids);
		
		return "ex02List";
	}
	
	@GetMapping("/ex02Array")
	public String ex02Array(@RequestParam("ids") String[] ids) {
		
		log.info("array ids: " + Arrays.toString(ids));
		
		return "ex02Array";
		
	}
	
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		
		log.info("" + dto);
		
		return "ex01";
	}
	
}
