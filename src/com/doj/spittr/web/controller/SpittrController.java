package com.doj.spittr.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpittrController {
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping(value={"/myProfile"})
	public String profile(ModelMap model){
		model.put("tab", "Profile");
		return "viewProfile";
	}
	@RequestMapping(value={"/editProfile"})
	public String editProfile(ModelMap model){
		model.put("tab", "Profile");
		return "editProfile";
	}
	@RequestMapping(value={"/changePassword"})
	public String changePassword(ModelMap model){
		model.put("tab", "Profile");
		return "changePassword";
	}
	@RequestMapping(value={"/changePicture"})
	public String changeProfilePic(ModelMap model){
		model.put("tab", "Profile");
		return "changePicture";
	}
	
	@RequestMapping(value={"/home","/", "/tweets"})
	public String home(ModelMap model){
		model.put("tab", "Home");
		return "home";
	}
	
	@RequestMapping("/message")
	public String writeMessage(ModelMap model){
		model.put("tab", "Message");
		return "message";
	}
	
	@RequestMapping("/myFollowers")
	public String myFollowres(ModelMap model){
		model.put("tab", "Followers");
		return "myFollowers";
	}
	@RequestMapping("/followers")
	public String followers(ModelMap model){	
		model.put("tab", "Followers");
		return "followers";
	}
	@RequestMapping("/following")
	public String following(ModelMap model){		
		return "following";
	}
	
	
}
