package com.techelevator.ssg.model;

public class DriveTimeEstimate {

	private String planetChoice;
	private String transportationChoice;
	private double earthAge;
	
	public DriveTimeEstimate(String planetChoice, String transportationChoice, double earthAge) {
		this.planetChoice = planetChoice;
		this.transportationChoice = transportationChoice;
		this.earthAge = earthAge;
	}

	public double getTimeTravelled() {
		double timeTravelled = 0;
		if (planetChoice.equalsIgnoreCase("Mercury") && transportationChoice.equalsIgnoreCase("Walking")) {
			timeTravelled = (56974146 / 3) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Mercury") && transportationChoice.equalsIgnoreCase("Car")) {
			timeTravelled = (56974146 / 100) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Mercury") && transportationChoice.equalsIgnoreCase("Train")) {
			timeTravelled = (56974146 / 200) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Mercury") && transportationChoice.equalsIgnoreCase("Boeing")) {
			timeTravelled = (56974146 / 570) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Mercury") && transportationChoice.equalsIgnoreCase("Concorde")) {
			timeTravelled = (56974146 / 1350) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Venus") && transportationChoice.equalsIgnoreCase("Walking")) {
			timeTravelled = (25724767 / 3) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Venus") && transportationChoice.equalsIgnoreCase("Car")) {
			timeTravelled = (25724767 / 100) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Venus") && transportationChoice.equalsIgnoreCase("Train")) {
			timeTravelled = (25724767 / 200) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Venus") && transportationChoice.equalsIgnoreCase("Boeing")) {
			timeTravelled = (25724767 / 570) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Venus") && transportationChoice.equalsIgnoreCase("Concorde")) {
			timeTravelled = (25724767 / 1350) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Mars") && transportationChoice.equalsIgnoreCase("Walking")) {
			timeTravelled = (48678219 / 3) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Mars") && transportationChoice.equalsIgnoreCase("Car")) {
			timeTravelled = (48678219 / 100) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Mars") && transportationChoice.equalsIgnoreCase("Train")) {
			timeTravelled = (48678219 / 200) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Mars") && transportationChoice.equalsIgnoreCase("Boeing")) {
			timeTravelled = (48678219 / 570) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Mars") && transportationChoice.equalsIgnoreCase("Concorde")) {
			timeTravelled = (48678219 / 1350) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Jupiter") && transportationChoice.equalsIgnoreCase("Walking")) {
			timeTravelled = (390674710 / 3) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Jupiter") && transportationChoice.equalsIgnoreCase("Car")) {
			timeTravelled = (390674710 / 100) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Jupiter") && transportationChoice.equalsIgnoreCase("Train")) {
			timeTravelled = (390674710 / 200) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Jupiter") && transportationChoice.equalsIgnoreCase("Boeing")) {
			timeTravelled = (390674710 / 570) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Jupiter") && transportationChoice.equalsIgnoreCase("Concorde")) {
			timeTravelled = (390674710 / 1350) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Saturn") && transportationChoice.equalsIgnoreCase("Walking")) {
			timeTravelled = (792248270 / 3) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Saturn") && transportationChoice.equalsIgnoreCase("Car")) {
			timeTravelled = (792248270 / 100) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Saturn") && transportationChoice.equalsIgnoreCase("Train")) {
			timeTravelled = (792248270 / 200) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Saturn") && transportationChoice.equalsIgnoreCase("Boeing")) {
			timeTravelled = (792248270 / 570) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Saturn") && transportationChoice.equalsIgnoreCase("Concorde")) {
			timeTravelled = (792248270 / 1350) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Uranus") && transportationChoice.equalsIgnoreCase("Walking")) {
			timeTravelled = (1643982054 / 3) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Uranus") && transportationChoice.equalsIgnoreCase("Car")) {
			timeTravelled = (1643982054 / 100) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Uranus") && transportationChoice.equalsIgnoreCase("Train")) {
			timeTravelled = (1643982054 / 200) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Uranus") && transportationChoice.equalsIgnoreCase("Boeing")) {
			timeTravelled = (1643982054 / 570) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Uranus") && transportationChoice.equalsIgnoreCase("Concorde")) {
			timeTravelled = (1643982054 / 1350) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Neptune") && transportationChoice.equalsIgnoreCase("Walking")) {
			timeTravelled = (2655279484.0 / 3) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Neptune") && transportationChoice.equalsIgnoreCase("Car")) {
			timeTravelled = (2655279484.0 / 3) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Neptune") && transportationChoice.equalsIgnoreCase("Train")) {
			timeTravelled = (2655279484.0 / 3) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Neptune") && transportationChoice.equalsIgnoreCase("Boeing")) {
			timeTravelled = (2655279484.0 / 3) / 8760;
		}
		else if (planetChoice.equalsIgnoreCase("Neptune") && transportationChoice.equalsIgnoreCase("Concorde")) {
			timeTravelled = (2655279484.0 / 3) / 8760;
		}
		return timeTravelled;
	}
	
	public double getNewAge() {
		double timeTravelled = getTimeTravelled();
		double newAge = timeTravelled + earthAge;
		return newAge;
	}

}