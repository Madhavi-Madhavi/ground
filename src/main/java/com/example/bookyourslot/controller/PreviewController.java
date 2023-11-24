package com.example.bookyourslot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PreviewController {

	@GetMapping("/preview")
	public String index() {
		return "pages/actions/preview.html";
	}
	@GetMapping("/getpreviewdetails")
	public String hello() {
		return "getdetails";
	}
	
}
