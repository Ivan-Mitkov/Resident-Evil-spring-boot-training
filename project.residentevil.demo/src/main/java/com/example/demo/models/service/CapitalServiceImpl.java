package com.example.demo.models.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.persistence.PersistenceContext;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Capital;
import com.example.demo.repositories.CapitalRepository;
import com.example.demo.services.CapitalService;

@Service
public class CapitalServiceImpl implements CapitalService {
	
	
	private CapitalRepository capitalRepository;
	@Autowired
	public CapitalServiceImpl(CapitalRepository capitalRepository) {
		this.capitalRepository = capitalRepository;
	}

	@Override
	public List<CapitalServiceModel> getAllCapitals() {
		ModelMapper mapper=new ModelMapper();
		List<Capital>capitals=capitalRepository.findAll();
		return capitals.stream()
				.map(x->mapper.map(x, CapitalServiceModel.class))
				.collect(Collectors.toList());
	}

	@Override
	public CapitalServiceModel getByName(String name) {
		ModelMapper mapper=new ModelMapper();
		Capital capital=capitalRepository.findByName(name);
		return mapper.map(capital, CapitalServiceModel.class);
	}

	@Override
	//search for substring ignoring case for example results for K and k are the same
	public List<CapitalServiceModel> getCapitalsByName(String name) {
		ModelMapper mapper=new ModelMapper();
		List<Capital>capitals=capitalRepository.findAll();
		return capitals.stream()
				.filter(x->
				(x.getName().contains(name.trim().toLowerCase())
						|x.getName().trim()
						.contains(name.substring(0, 1).toUpperCase()+name.substring(1))))
				.map(x->mapper.map(x, CapitalServiceModel.class))		
				.collect(Collectors.toList());
	}

	
	
	
}
