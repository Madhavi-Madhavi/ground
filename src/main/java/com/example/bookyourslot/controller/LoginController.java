package com.example.bookyourslot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bookyourslot.model.Login;
import com.example.bookyourslot.repo.LoginRepository;

@Controller
public class LoginController {
	@Autowired
	LoginRepository loginRepository;
	@GetMapping("/login")
	public String index() {
		return "pages/samples/login.html";
	}
	@PostMapping("/saveLogin")
	public String userRegistration (@ModelAttribute Login login, Model model) {
				
		Login login_inserted= loginRepository.save(login);
		model.addAttribute("Message" ,login_inserted.getUsernameoremail() + "Ground booked successfully");
		return "pages/ui-features/dashboard.html";
	}
}
