package com.example.demo.models.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Capital;
import com.example.demo.entity.Virus;
import com.example.demo.models.binding.AddVirusBindingModel;
import com.example.demo.repositories.CapitalRepository;
import com.example.demo.repositories.VirusRepository;
import com.example.demo.services.CapitalService;
import com.example.demo.services.VirusService;
@Service
@Transactional
public class VirusServiceImpl implements VirusService {
	@Autowired
	private final VirusRepository virusRepository;
	@Autowired
	private final CapitalRepository cap;
	@Autowired
    private ModelMapper mapper;
	
	
	

	public VirusServiceImpl(VirusRepository virusRepository, CapitalRepository cap) {
		this.virusRepository = virusRepository;
		this.cap = cap;
	}

	@Override
	public void createVirus(AddVirusBindingModel virusModel) {
		
		Virus virus=mapper.map(virusModel, Virus.class);
		String[] date=virusModel.getReleasedOn().split("-");
		
		virus.setReleasedOn(LocalDate
				.of(Integer.parseInt(date[0])
						,Integer.parseInt(date[1])
						,Integer.parseInt(date[2]) ));
		
		virus.setCapitals(virusModel.getCapitals()
				.stream()
				.map(x->cap.findByName(x))
				.collect(Collectors.toList()));
				
		virusRepository.save(virus);
	}

	@Override
	public void editVirus(VirusServiceModel virusModel) {
		
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
		
		List<Virus>viruses=virusRepository.findAll();
		List<VirusServiceModel> virusesDto=viruses.stream()
				.map(x->mapper.map(x, VirusServiceModel.class))
				.collect(Collectors.toList());
		return virusesDto;
	}
	
	
}
