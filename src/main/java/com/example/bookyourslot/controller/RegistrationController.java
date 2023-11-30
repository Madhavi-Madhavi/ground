package com.example.bookyourslot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bookyourslot.model.Dashboard;
import com.example.bookyourslot.model.Registration;
import com.example.bookyourslot.repo.DashboardRepository;
import com.example.bookyourslot.repo.RegistrationRepository;

@Controller
public class RegistrationController {

	@Autowired
	RegistrationRepository registrationRepository;

	@Autowired
	DashboardRepository dashboardRepository;

	@GetMapping("/register")
	public String groundRegistration(@ModelAttribute Registration registration) {

		Registration registration_inserted = registrationRepository.save(registration);
		return "pages/ui-features/groundregistration.html";
	}

	@PostMapping("/saveRegistraion")
	public String userRegistration(@ModelAttribute Dashboard dashboard, Model model) {

//		Registration registration_inserted= registrationRepository.save(registration);
		dashboardRepository.save(dashboard);
//		model.addAttribute("Message" ,registration_inserted.getEmail() + "Ground booked successfully");
		return "pages/ui-features/groundregistration.html";
	}
}
