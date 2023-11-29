package com.example.blog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping(value = "/")
	public String index() {
		return "index";
	}
	
	@GetMapping(value="/sign")
	public String signup() {
		return "/user/sign";
	}
}
