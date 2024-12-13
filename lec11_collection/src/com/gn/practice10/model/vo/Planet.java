package com.gn.practice10.model.vo;

public class Planet {
	private String name;
	private int diameter;
	private double period;
	
	
	
	public Planet() {}
	public Planet(String name, int diameter, double period) {
		super();
		this.name = name;
		this.diameter = diameter;
		this.period = period;
	}
	public String getName() {
		return name;
	}
	public int getDiameter() {
		return diameter;
	}
	public double getperiod() {
		return period;
	}
	@Override
	public String toString() {
		return  name + " (지름:" + diameter +"km, 공전주기: " + period+"년)";
	}
	

	
	
	

}
