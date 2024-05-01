package com.main.docker.k8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/message")
	public String displayMessage(){
		return "Congratulations!! Application successfully deployed to kubernetes !!";
	}

}
