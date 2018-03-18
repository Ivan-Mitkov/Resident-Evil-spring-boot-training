package com.example.demo.models.service;

import org.springframework.stereotype.Component;

@Component
public class CapitalServiceModel {
	private long id;
	private String name;
	
	private double latitude;
	private double longitude;
	
	public CapitalServiceModel() {
		// TODO Auto-generated constructor stub
	}

	

	public CapitalServiceModel(String name, double latitude, double longitude) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
}
