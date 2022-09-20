package io.basicspringbootApplication.PracticeSprintboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloConroller {
	
	
	@RequestMapping ("/hello")
	public String sayhi() {
		return "Hi";
	}

}
