package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Capital;
import com.example.demo.entity.Virus;
import com.example.demo.entity.enums.Creator;
import com.example.demo.entity.enums.Magnitude;
import com.example.demo.entity.enums.Mutation;
import com.example.demo.models.binding.AddVirusBindingModel;
import com.example.demo.models.service.VirusServiceImpl;
import com.example.demo.models.service.VirusServiceModel;

@SpringBootApplication
@Component
public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	private VirusServiceImpl virusService;
	@Autowired
	private AddVirusBindingModel virusDTO;
	@Autowired
	private VirusServiceModel virusServiceDTO;
	@Autowired
	private ModelMapper mapper;
	
	
	@Override
	public void run(String... args) throws Exception {
		Creator corp= Creator.Corp;
		Magnitude mag=Magnitude.High; 
		Mutation mut=Mutation.GIANT_SPIDER;
		LocalDate date=LocalDate.now();
		List<Capital>capital=new ArrayList<>();
		Capital kab=new Capital("Kabul", 69.17,34.53);
		capital.add(kab);
        Virus virus=new Virus("Grip", "None","No",corp, true, true,
        		mut,12,13,mag,date,capital);
        
        mapper.map(virus, virusDTO);
        
        System.out.println(virusDTO.getName());
        System.out.println(virusDTO.getCreator()+" "+virusDTO.getCreator().getClass());
        System.out.println(virusDTO.getDescription());
        System.out.println(virusDTO.getHoursUntilTurn());
        System.out.println(virusDTO.getMagnitude()+" "+virusDTO.getCreator().getClass());
        System.out.println(virusDTO.getMutation()+" "+virusDTO.getCreator().getClass());
        System.out.println(Arrays.toString(virusDTO.getCapitals().toArray())+" "+virusDTO.getCreator().getClass());   
        System.out.println(virusDTO.getReleasedOn()+" "+virusDTO.getCreator().getClass());
        System.out.println(virusDTO.getIsCurable());
        System.out.println(virusDTO.getIsDeadly());
       System.out.println("AFTER ");
       
	}
	
}
