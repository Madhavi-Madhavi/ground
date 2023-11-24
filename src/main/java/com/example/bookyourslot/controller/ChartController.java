package com.example.bookyourslot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChartController {

	@GetMapping("/statistics")
	public String index() {
		return "pages/charts/chartjs.html";
	}
}
