package com.example.demo.models.view;

import java.util.ArrayList;
import java.util.List;

public class AddVirusViewModel {
	private List<String>capitals;

	public List<String> getCapitals() {
		return capitals;
	}

	public void setCapitals(List<String> capitals) {
		this.capitals = capitals;
	}
	
	public AddVirusViewModel() {
		this.capitals=new ArrayList<>();
	}
}
