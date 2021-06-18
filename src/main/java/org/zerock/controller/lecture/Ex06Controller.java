package org.zerock.controller.lecture;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/ex06/*")
public class Ex06Controller {
	
	@RequestMapping("/sub01")
	public String method01() {
		
		log.info("ex06, sub01 method");
		
		
		return "ex06/sub01";

		// WEB-INF/views/ex06/sub01.jsp
	}
	
	@RequestMapping("/sub02")
	public void method02() {
		
		log.info("Ex06, sub02 method");
		
	}
	
}