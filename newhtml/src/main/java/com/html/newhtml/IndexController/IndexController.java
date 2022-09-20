package com.html.newhtml.IndexController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import

import com.html.newhtml.model.UserData;

@Controller
public class IndexController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@PostMapping("register")
	public String userregister(@ModelAttribute UserData user) {
		System.out.println(user.toString());
		System.out.println(user.getFname());
		System.out.println(user.getLname());
		System.out.println(user.getDob());
		System.out.println(user.getEmail());
		UserData.addAttribute("Firstname",user.getFname());
		model
		return "welcome";
	}

}
