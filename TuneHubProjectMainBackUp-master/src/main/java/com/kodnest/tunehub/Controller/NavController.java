package com.kodnest.tunehub.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	@GetMapping("/login")
	public String login() {
		return "login";
		
	}
	@GetMapping("/registration")
	public String registration() {
		return "registration";
		
	}
	
	@GetMapping("/addsong")
	public String song() {
		return "song";
		
	}
	@GetMapping("/googleregister")
	public String googleregister() {
		return "googleregister";
		
	}
	
	@GetMapping("/forgotpassword")
	public String forgotPassword() {
	    return "forgotpassword"; // return the forgot password HTML page
	}
	
	
	
	
	
	
	

}
