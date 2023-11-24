package com.example.bookyourslot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bookyourslot.model.Registration;
import com.example.bookyourslot.repo.RegistrationRepository;

@Controller
public class RegistrationController {

	@Autowired
	RegistrationRepository registrationRepository;
	
	@GetMapping("/register")
	public String index() {
		return "pages/samples/register.html";
	}	
	
	@PostMapping("/saveRegistraion")
	public String userRegistration (@ModelAttribute Registration registration, Model model) {
				
		Registration registration_inserted= registrationRepository.save(registration);
		model.addAttribute("Message" ,registration_inserted.getEmail() + "Ground booked successfully");
		return "pages/ui-features/dashboard.html";
	}
}

