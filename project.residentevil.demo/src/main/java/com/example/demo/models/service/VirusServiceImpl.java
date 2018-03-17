package com.example.demo.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Virus;
import com.example.demo.repositories.VirusRepository;
import com.example.demo.services.VirusService;
@Service
public class VirusServiceImpl implements VirusService {

	private final VirusRepository virusRepository;
	
	@Autowired
	public VirusServiceImpl(VirusRepository virusRepository) {
		this.virusRepository = virusRepository;
	}

	@Override
	public void saveVirus(VirusServiceModel virusModel) {
		ModelMapper mapper=new ModelMapper();
		Virus virus=mapper.map(virusModel, Virus.class);
		virusRepository.save(virus);
	}

	@Override
	public void editVirus(VirusServiceModel virusModel) {
		ModelMapper mapper=new ModelMapper();
		Virus virus=mapper.map(virusModel, Virus.class);
		virusRepository.save(virus);
		
	}

	@Override
	public void deleteVirus(VirusServiceModel virusModel) {
		ModelMapper mapper=new ModelMapper();
		Virus virus=mapper.map(virusModel, Virus.class);
		virusRepository.delete(virus);
		
	}

	

	@Override
	public List<VirusServiceModel> getAllViruses() {
		ModelMapper mapper=new ModelMapper();
		List<Virus>viruses=virusRepository.findAll();
		List<VirusServiceModel> virusesDto=viruses.stream()
				.map(x->mapper.map(x, VirusServiceModel.class))
				.collect(Collectors.toList());
		return virusesDto;
	}

}
