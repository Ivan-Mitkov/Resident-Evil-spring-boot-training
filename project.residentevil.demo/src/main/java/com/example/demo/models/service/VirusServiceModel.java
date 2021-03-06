package com.example.demo.models.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
public class VirusServiceModel {
	
	private String name;
	private String description ;
	private String sideEffects;
	private String creator;
	private boolean	isDeadly;
	private boolean	isCurable;
	private String mutation;
	private int	turnoverRate;
	private int hoursUntilTurn;
	private String magnitude;
	@DateTimeFormat(pattern="MM-dd-YYYY")
	private String	releasedOn;
	List<String> capitals;
	public VirusServiceModel() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSideEffects() {
		return sideEffects;
	}
	public void setSideEffects(String sideEffects) {
		this.sideEffects = sideEffects;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public boolean getIsDeadly() {
		return isDeadly;
	}
	public void setIsDeadly(boolean isDeadly) {
		this.isDeadly = isDeadly;
	}
	public boolean getIsCurable() {
		return isCurable;
	}
	public void setIsCurable(boolean isCurable) {
		this.isCurable = isCurable;
	}
	public String getMutation() {
		return mutation;
	}
	public void setMutation(String mutation) {
		this.mutation = mutation;
	}
	public int getTurnoverRate() {
		return turnoverRate;
	}
	public void setTurnoverRate(int turnoverRate) {
		this.turnoverRate = turnoverRate;
	}
	public int getHoursUntilTurn() {
		return hoursUntilTurn;
	}
	public void setHoursUntilTurn(int hoursUntilTurn) {
		this.hoursUntilTurn = hoursUntilTurn;
	}
	public String getMagnitude() {
		return magnitude;
	}
	public void setMagnitude(String magnitude) {
		this.magnitude = magnitude;
	}
	
	public String getReleasedOn() {
		return releasedOn;
	}


	public void setReleasedOn(String releasedOn) {
		this.releasedOn = releasedOn;
	}


	public List<String> getCapitals() {
		return capitals;
	}
	public void setCapitals(List<String> capitals) {
		this.capitals = capitals;
	}
	
	
}
