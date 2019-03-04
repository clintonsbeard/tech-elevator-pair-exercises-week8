package com.techelevator.ssg.model;

public class AlienWeightEstimate {

	private String planetChoice;
	private double earthWeight;
	
	public AlienWeightEstimate(String planetChoice, double earthWeight) {
		this.planetChoice = planetChoice;
		this.earthWeight = earthWeight;
	}

	public double getResultWeight() {
		double resultWeight = 0;
		if (planetChoice.equalsIgnoreCase("Mercury")) {
			resultWeight = earthWeight * 0.37;
		}
		else if (planetChoice.equalsIgnoreCase("Venus")) {
			resultWeight = earthWeight * 0.90;
		}
		else if (planetChoice.equalsIgnoreCase("Mars")) {
			resultWeight = earthWeight * 0.38;
		}
		else if (planetChoice.equalsIgnoreCase("Jupiter")) {
			resultWeight = earthWeight * 2.65;
		}
		else if (planetChoice.equalsIgnoreCase("Saturn")) {
			resultWeight = earthWeight * 1.13;
		}
		else if (planetChoice.equalsIgnoreCase("Uranus")) {
			resultWeight = earthWeight * 1.09;
		}
		else if (planetChoice.equalsIgnoreCase("Neptune")) {
			resultWeight = earthWeight * 1.43;
		}
		return resultWeight;
	}
}