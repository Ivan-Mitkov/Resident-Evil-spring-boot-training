package com.example.demo.services;

import java.util.List;

import com.example.demo.models.binding.AddVirusBindingModel;
import com.example.demo.models.service.VirusServiceModel;

public interface VirusService {
	public void createVirus(AddVirusBindingModel virusModel);
	public void editVirus(VirusServiceModel virusModel);
	public void deleteVirus(VirusServiceModel virusModel);
	public List<VirusServiceModel> getAllViruses();
}
