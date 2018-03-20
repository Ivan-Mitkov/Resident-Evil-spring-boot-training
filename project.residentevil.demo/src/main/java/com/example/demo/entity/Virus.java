package com.example.demo.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.example.demo.entity.enums.Creator;
import com.example.demo.entity.enums.Magnitude;
import com.example.demo.entity.enums.Mutation;

@Entity
@Table(name="viruses")
public class Virus {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	

	@Column(nullable =false)
	private String name;
	
	@Column( nullable =false)
	private String description ;
	
	@Column( nullable =false)
	private String sideEffects;
	
	@Enumerated(EnumType.STRING)
	@Column( nullable =false)
	private Creator creator;
	
	@Column( nullable =false)
	private boolean	isDeadly;
	
	@Column( nullable =false)
	private boolean	isCurable;
	
	@Enumerated(EnumType.STRING)
	@Column( nullable =false)
	private Mutation mutation;
	
	@Column( nullable =false)
	private int	turnoverRate;
	
	@Column( nullable =false)
	private int hoursUntilTurn;
	
	@Enumerated(EnumType.STRING)
	@Column( nullable =false)
	private Magnitude magnitude;
	
	
	@Column( nullable =false)
	private LocalDate	releasedOn;
	
	
	@ManyToMany
	@JoinTable(name="viruses_capitals",
	joinColumns=@JoinColumn(name="virus_id"),
    inverseJoinColumns = { @JoinColumn(name = "capitals_id")})
	List<Capital> capitals;


	public Virus() {
		
	}


	public Virus( String name, String description, String sideEffects, Creator creator, boolean isDeadly,
			boolean isCurable, Mutation mutation, int turnoverRate, int hoursUntilTurn, Magnitude magnitude,
			LocalDate releasedOn, List<Capital> capitals) {
	
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
