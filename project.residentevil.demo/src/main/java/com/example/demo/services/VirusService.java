package com.example.demo.services;

import com.example.demo.models.service.VirusServiceModel;

public interface VirusService {
	public void saveVirus(VirusServiceModel virusModel);
	public void editVirus(VirusServiceModel virusModel);
	public void deleteVirus(VirusServiceModel virusModel);
	public void showViruses();
}
