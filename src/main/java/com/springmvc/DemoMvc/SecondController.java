package com.springmvc.DemoMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {

	@RequestMapping("/secondPage")
	public String displaySecondPage() {
		return "secondPage";
	}
}
