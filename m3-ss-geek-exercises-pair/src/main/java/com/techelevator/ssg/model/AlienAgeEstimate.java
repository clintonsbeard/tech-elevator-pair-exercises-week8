package com.techelevator.ssg.model;

public class AlienAgeEstimate {

	private String planetChoice;
	private double earthAge;
	
	public AlienAgeEstimate(String planetChoice, double earthAge) {
		this.planetChoice = planetChoice;
		this.earthAge = earthAge;
	}

	public double getResultAge() {
		double resultAge = 0;
		if (planetChoice.equalsIgnoreCase("Mercury")) {
			resultAge = earthAge * 0.241;
		}
		else if (planetChoice.equalsIgnoreCase("Venus")) {
			resultAge = earthAge * 0.615;
		}
		else if (planetChoice.equalsIgnoreCase("Mars")) {
			resultAge = earthAge * 1.881;
		}
		else if (planetChoice.equalsIgnoreCase("Jupiter")) {
			resultAge = earthAge * 11.86;
		}
		else if (planetChoice.equalsIgnoreCase("Saturn")) {
			resultAge = earthAge * 29.46;
		}
		else if (planetChoice.equalsIgnoreCase("Uranus")) {
			resultAge = earthAge * 84.01;
		}
		else if (planetChoice.equalsIgnoreCase("Neptune")) {
			resultAge = earthAge * 164.8;
		}
		return resultAge;
	}
}