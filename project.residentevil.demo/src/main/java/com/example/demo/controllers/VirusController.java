package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Capital;
import com.example.demo.models.binding.AddVirusBindingModel;
import com.example.demo.models.service.CapitalServiceModel;
import com.example.demo.models.service.VirusServiceModel;
import com.example.demo.models.view.AddVirusViewModel;
import com.example.demo.services.CapitalService;
import com.example.demo.services.VirusService;

@Controller
@RequestMapping("/viruses")
public class VirusController {

	private CapitalService capitalService;
	private VirusService virusService;
	@Autowired
	public VirusController(CapitalService capitalService, VirusService virusService) {
		this.capitalService = capitalService;
		this.virusService=virusService;
	}
	
	@GetMapping("/add")
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
	
	@PostMapping("/addVirus")
	public ModelAndView saveViruse(@Valid @ModelAttribute AddVirusBindingModel virusModel,
			 BindingResult result,
			ModelAndView modelAndView) {
		
		if (result.hasErrors()) {
			modelAndView.setViewName("redirect:/");
			
	    }
		else {
			virusService.createVirus(virusModel);
			modelAndView.setViewName("show_all_viruses");
		}
		
		return modelAndView;
	}
	
	@GetMapping("/show")
	public ModelAndView showViruses(ModelAndView modelAndView) {
		modelAndView.setViewName("show_all_viruses");
		List<VirusServiceModel>viruses=new ArrayList<>();
		viruses=virusService.getAllViruses();
		
		modelAndView.addObject("viruses", viruses);
		return modelAndView;
	}
	
	
}
