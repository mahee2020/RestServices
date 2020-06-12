package com.emp.service.empService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpDetaill {

	@GetMapping("/hello")
	public String test()
	{
		return "HI";
	}

}
