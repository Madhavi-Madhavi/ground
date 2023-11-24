package com.example.bookyourslot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bookyourslot.model.GroundSelection;
import com.example.bookyourslot.repo.GroundSelectionRepository;

@Controller
public class GroundSelectionController {
	
	@Autowired
	private GroundSelectionRepository groundSelectionRepository;

	@GetMapping("/groundselection")
	public String index() {
		return "pages/actions/groundselection.html";
	}
	
	@PostMapping("/saveSelectedGroundDetails")
	public String userRegistration (@ModelAttribute GroundSelection groundSelection, Model model) {
		
		 groundSelectionRepository.save(groundSelection);
		return "pages/actions/preview.html";
	}
}
