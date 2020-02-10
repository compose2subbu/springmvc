package com.springmvc.DemoMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

	@RequestMapping("/firstPage")
	public String displayFirstPage() {
		return "myPage";
	}
	
}
