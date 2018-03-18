package com.example.demo.services;

import java.util.List;

import com.example.demo.models.service.CapitalServiceModel;

public interface CapitalService {
	List<CapitalServiceModel> getAllCapitals();
	CapitalServiceModel getByName(String name);
	List<CapitalServiceModel> getCapitalsByName(String name);
	
}
