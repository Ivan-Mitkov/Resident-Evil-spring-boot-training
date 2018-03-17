package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Capital;
import com.example.demo.models.service.CapitalServiceModel;
import com.example.demo.models.view.AddVirusViewModel;
import com.example.demo.services.CapitalService;

@Controller
public class VirusController {

	private CapitalService capitalService;
	@Autowired
	public VirusController(CapitalService capitalService) {
		this.capitalService = capitalService;
	}
	
	@GetMapping("/viruses/add")
	public ModelAndView addVirus(ModelAndView modelAndView) {
		modelAndView.setViewName("add_virus");
		
		AddVirusViewModel addVirusViewModel=new AddVirusViewModel();
		
		List<CapitalServiceModel> capitals=this.capitalService.getAllCapitals();
		for(CapitalServiceModel capitalServiceModel:capitals) {
			addVirusViewModel.getCapitals().add(capitalServiceModel.getName());
		}
		
		modelAndView.addObject("addVirusViewModel",addVirusViewModel);
		return modelAndView;
	}
	@GetMapping("viruses/show")
	public ModelAndView showViruses(ModelAndView modelAndView) {
		modelAndView.setViewName("index");//za momenta
		return modelAndView;
	}
	
	
}
