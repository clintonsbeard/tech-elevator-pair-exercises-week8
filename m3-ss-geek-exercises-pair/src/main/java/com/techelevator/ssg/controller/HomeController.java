package com.techelevator.ssg.controller;

import java.time.LocalDateTime;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.ssg.model.AlienAgeEstimate;
import com.techelevator.ssg.model.AlienWeightEstimate;
import com.techelevator.ssg.model.DriveTimeEstimate;
import com.techelevator.ssg.model.forum.ForumDao;
import com.techelevator.ssg.model.forum.ForumPost;

@Controller
public class HomeController {

	@Autowired
	private ForumDao forumDao;
	
	@RequestMapping("/")
	public String displayHomePage() {
		return "homePage";
	}
	
	@RequestMapping("/alienWeight")
	public String displayAlienWeight() {
		return "alienWeight";
	}
	
	@RequestMapping("/alienAge")
	public String displayAlienAge() {
		return "alienAge";
	}
	
	@RequestMapping("/driveTime")
	public String displayDriveTime() {
		return "driveTime";
	}
	
	@RequestMapping("/submitPost")
	public String displaySubmitPost() {
		return "submitPost";
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
	
	@RequestMapping(path="/postProcessor", method=RequestMethod.POST)
	public String submitPostAndRedirect(ForumPost newForumPost) {
		newForumPost.setDatePosted(LocalDateTime.now());
		forumDao.save(newForumPost);
		return "redirect:/viewPosts";
	}
	
	@RequestMapping(path="/viewPosts", method=RequestMethod.GET)
	public String getAllPosts(ModelMap map) {
		map.addAttribute("posts", forumDao.getAllPosts());	
		return "viewPosts";
	}
	
}