package com.example.demo.models.service;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.entity.Capital;
import com.example.demo.entity.enums.Creator;
import com.example.demo.entity.enums.Magnitude;
import com.example.demo.entity.enums.Mutation;

public class VirusServiceModel {

	private long id;
	private String name;
	private String description ;
	private String sideEffects;
	private Creator creator;
	private boolean	isDeadly;
	private boolean	isCurable;
	private Mutation mutation;
	private int	turnoverRate;
	private int hoursUntilTurn;
	private Magnitude magnitude;
	private LocalDate	releasedOn;
	List<Capital> capitals;
	public VirusServiceModel() {
		// TODO Auto-generated constructor stub
	}
	public VirusServiceModel(String name, String description, String sideEffects, Creator creator,
			boolean isDeadly, boolean isCurable, Mutation mutation, int turnoverRate, int hoursUntilTurn,
			Magnitude magnitude, LocalDate releasedOn, List<Capital> capitals) {
		
		this.name = name;
		this.description = description;
		this.sideEffects = sideEffects;
		this.creator = creator;
		this.isDeadly = isDeadly;
		this.isCurable = isCurable;
		this.mutation = mutation;
		this.turnoverRate = turnoverRate;
		this.hoursUntilTurn = hoursUntilTurn;
		this.magnitude = magnitude;
		this.releasedOn = releasedOn;
		this.capitals = capitals;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public Creator getCreator() {
		return creator;
	}
	public void setCreator(Creator creator) {
		this.creator = creator;
	}
	public boolean isDeadly() {
		return isDeadly;
	}
	public void setDeadly(boolean isDeadly) {
		this.isDeadly = isDeadly;
	}
	public boolean isCurable() {
		return isCurable;
	}
	public void setCurable(boolean isCurable) {
		this.isCurable = isCurable;
	}
	public Mutation getMutation() {
		return mutation;
	}
	public void setMutation(Mutation mutation) {
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
	public Magnitude getMagnitude() {
		return magnitude;
	}
	public void setMagnitude(Magnitude magnitude) {
		this.magnitude = magnitude;
	}
	public LocalDate getReleasedOn() {
		return releasedOn;
	}
	public void setReleasedOn(LocalDate releasedOn) {
		this.releasedOn = releasedOn;
	}
	public List<Capital> getCapitals() {
		return capitals;
	}
	public void setCapitals(List<Capital> capitals) {
		this.capitals = capitals;
	}
	
}
