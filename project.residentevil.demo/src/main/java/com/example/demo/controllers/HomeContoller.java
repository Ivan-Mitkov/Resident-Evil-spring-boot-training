package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.service.CapitalServiceModel;
import com.example.demo.services.CapitalService;

@Controller
public class HomeContoller {
	
	private CapitalService capitalService;
	@Autowired
	public HomeContoller(CapitalService capitalService) {
		this.capitalService = capitalService;
	}

	@GetMapping("/")
	public ModelAndView index(ModelAndView model) {
		List<CapitalServiceModel>capitals=new ArrayList<>();
		capitals=capitalService.getAllCapitals();
		model.setViewName("index");
		model.addObject("capitals", capitals);
		return model;
	}
}
