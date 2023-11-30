package com.example.bookyourslot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bookyourslot.model.Dashboard;
import com.example.bookyourslot.repo.DashboardRepository;

@Controller
public class DashboardController {
	@Autowired
	private DashboardRepository dashbaordRepository;

	@GetMapping("/dashboard")
	public String getGrounds(Model model) {
		Iterable<Dashboard> list = dashbaordRepository.findAll();
		model.addAttribute("grounds", list);
		return "pages/ui-features/dashboard.html";
	}

	@PostMapping("/existedgrounds")
	public String saveStaticGrounds() {
		Dashboard dash = new Dashboard(null, null);
		dash.setGroundname("Babukhan Arena (Kokapet)");
		dash.setPlace("Kokapet");
		dash.setGroundname("ElitesMRR cricket ground(Aziz Nagar)");
		dash.setPlace("Aziz Nagar");
		dash.setGroundname("K.B.R. cricket ground(Yenikepally)");
		dash.setPlace("Yenikepally");
		
		dash.setGroundname("MBR Grounds(Yenikepally)");
		dash.setPlace("Yenikepally");
		
		dash.setGroundname("Melgiri Cricket Ground(Yenikepally)");
		dash.setPlace("Yenikepally");
		
		dash.setGroundname("MLR Grounds(Suraram)");
		dash.setPlace("Suraram");
		
		dash.setGroundname("MRE Grounds(Aziz Nagar)");
		dash.setPlace("Aziz Nagar");

		List<Dashboard> grounds = new ArrayList<>();
		grounds.add(dash);
		dashbaordRepository.saveAll(grounds);

		return "pages/ui-features/dashboard.html";
	}

}
