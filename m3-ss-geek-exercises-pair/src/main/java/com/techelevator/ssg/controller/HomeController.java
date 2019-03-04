package com.techelevator.ssg.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.ssg.model.AlienAgeEstimate;
import com.techelevator.ssg.model.AlienWeightEstimate;
import com.techelevator.ssg.model.DriveTimeEstimate;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String displayHomePage() {
		return "homePage";
	}
	
	@RequestMapping("/alienWeight")
	public String displayAlienWeight() {
		return "/alienWeight";
	}
	
	@RequestMapping("/alienAge")
	public String displayAlienAge() {
		return "/alienAge";
	}
	
	@RequestMapping("/driveTime")
	public String displayDriveTime() {
		return "/driveTime";
	}
	
	@RequestMapping("/alienWeightResult")
	public String displayAlienWeightResult(HttpServletRequest request) {
		
		String planetChoice = request.getParameter("planets");
		double earthWeight = Integer.parseInt(request.getParameter("weight"));
		
		AlienWeightEstimate estimate = new AlienWeightEstimate(planetChoice, earthWeight);
		request.setAttribute("estimate", estimate);
		
		return "alienWeightResult";
	}
	
	@RequestMapping("/alienAgeResult")
	public String displayAlienAgeResult(HttpServletRequest request) {
		
		String planetChoice = request.getParameter("planets");
		double earthAge = Integer.parseInt(request.getParameter("age"));
		
		AlienAgeEstimate estimate = new AlienAgeEstimate(planetChoice, earthAge);
		request.setAttribute("estimate", estimate);
		
		return "alienAgeResult";
	}
	
	@RequestMapping("/driveTimeResult")
	public String displayDriveTimeResult(HttpServletRequest request) {
		
		String planetChoice = request.getParameter("planets");
		String transportationChoice = request.getParameter("transportations");
		double earthAge = Integer.parseInt(request.getParameter("age"));
		
		DriveTimeEstimate estimate = new DriveTimeEstimate(planetChoice, transportationChoice, earthAge);
		request.setAttribute("estimate", estimate);
		
		return "driveTimeResult";
	}
}