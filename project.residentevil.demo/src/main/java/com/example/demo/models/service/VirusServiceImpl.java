package com.example.demo.models.service;

import com.example.demo.repositories.VirusRepository;
import com.example.demo.services.VirusService;

public class VirusServiceImpl implements VirusService {

	private final VirusRepository virusRepository;
	
	
	public VirusServiceImpl(VirusRepository virusRepository) {
		this.virusRepository = virusRepository;
	}

	@Override
	public void saveVirus(VirusServiceModel virusModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editVirus(VirusServiceModel virusModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteVirus(VirusServiceModel virusModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showViruses() {
		// TODO Auto-generated method stub
		
	}

}
