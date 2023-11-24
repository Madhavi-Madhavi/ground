package com.example.bookyourslot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

	@GetMapping("/about-app")
	public String aboutApp() {
		return "pages/ui-features/aboutapp.html";
	}
	@GetMapping("/about-team")
	public String aboutTeam() {
		return "pages/ui-features/aboutteam.html";
	}
	
}
