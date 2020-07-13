package com.cormacx.elementservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Element {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
	private String name;
	
	@Column(unique = true)
	private Integer atomicNumber;
	
	@Column(unique = true)
	private String symbol;
	
	private String group;
	
	private String period;
	
	private Float atomicWeight;
	
	private Float densityGramsPerCubicCentimeter;
	
	
}
