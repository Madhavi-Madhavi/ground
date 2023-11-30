package com.example.bookyourslot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bookyourslot.model.Dashboard;
import com.example.bookyourslot.model.Ground;
import com.example.bookyourslot.model.MatchSelection;
import com.example.bookyourslot.repo.DashboardRepository;
import com.example.bookyourslot.repo.MatchSelectionRepository;

@Controller
public class MatchSelectionController {

	@Autowired
	private MatchSelectionRepository matchSelectionRepository;
	@Autowired
	private DashboardRepository dashbaordRepository;

	@GetMapping("/matchselection")
	public String index(Model model) {
		Iterable<Dashboard> list = dashbaordRepository.findAll();
		model.addAttribute("grounds", list);
		return "pages/actions/matchselection.html";
	}

	@PostMapping("/saveSelectedMatchDetails")
	public String userRegistration(@ModelAttribute MatchSelection matchSelection, Model model) {
		model.addAttribute("name", matchSelection.getMatchtype());

		MatchSelection match_inserted = matchSelectionRepository.save(matchSelection);
		model.addAttribute("Message", match_inserted.getMatchtype() + "Match booked successfully");
		return "pages/actions/groundselection.html";
	}
	

	
}
