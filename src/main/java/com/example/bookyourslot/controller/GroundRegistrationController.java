//package com.example.bookyourslot.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import com.example.bookyourslot.model.Ground;
//import com.example.bookyourslot.repo.BookgroundRepository;
//
//@Controller
//public class GroundRegistrationController {
//	
//	@Autowired
//	private BookgroundRepository bookgroundRepository;
//
//	@GetMapping("/")
//	public String index() {
//		return "index";
//	}
//	@GetMapping("/registerground")
//	public String groundregistration(@ModelAttribute ) {
//		
//		return "pages/ui-features/groundregistration.html";
//	}
//	
//	
//	
//	@PostMapping("/savegrounddetails")
//	public String userRegistration (@ModelAttribute Ground ground, Model model) {
//		model.addAttribute("name", ground.getName());
//		model.addAttribute("email", ground.getEmail());
//		model.addAttribute("password", ground.getPassword());
//		model.addAttribute("phone", ground.getPhone());
//		model.addAttribute("comments", ground.getComments());
//		model.addAttribute("gender", ground.getGender());
//		
//		Ground ground_inserted= bookgroundRepository.save(ground);
//		model.addAttribute("Message" ,ground_inserted.getEmail() + "Ground booked successfully");
//		return "pages/actions/matchselection.html";
//	}
//}
