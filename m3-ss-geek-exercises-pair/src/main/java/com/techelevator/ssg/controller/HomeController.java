package com.techelevator.ssg.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@RequestMapping("/weightResult")
	public String displayAlienWeightResult(HttpServletRequest request) {
		
		double earthWeight = Integer.parseInt(s)
	}
}