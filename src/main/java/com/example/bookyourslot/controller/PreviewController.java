package com.example.bookyourslot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bookyourslot.model.PreviewDetails;
import com.example.bookyourslot.repo.PreviewRepository;

@Controller
public class PreviewController {
	@Autowired
	PreviewRepository previewRepo;

	@GetMapping("/preview")
	public String index() {
		return "pages/actions/preview.html";
	}

	@GetMapping("/getpreviewdetails")
	public String getPreviewDetails(Model model) {
		Iterable<PreviewDetails> list = previewRepo.findAll();
		model.addAttribute("previewdetails", list);
		return "pages/forms/bookground.html";
	}

	@PostMapping("/savealldetails")
//	@ResponseBody
	public String userRegistration(@ModelAttribute PreviewDetails preview, Model model) {
		model.addAttribute("matchtype", preview.getMatchtype());
		model.addAttribute("date", preview.getDate());
		model.addAttribute("timeslot", preview.getTime());
		model.addAttribute("groundname", preview.getGroundname());

		model.addAttribute("name", preview.getName());
		model.addAttribute("email", preview.getEmail());

		model.addAttribute("phone", preview.getPhone());
		model.addAttribute("comments", preview.getComments());
		model.addAttribute("gender", preview.getGender());

		PreviewDetails previewDetails = previewRepo.save(preview);
//		model.addAttribute("Message", ground_inserted.getEmail() + "Ground booked successfully");
		return "pages/actions/matchselection.html";

	}
}
