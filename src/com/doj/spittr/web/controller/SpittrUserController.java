package com.doj.spittr.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.doj.spittr.entities.Dusr;
import com.doj.spittr.entities.PasswordManagement;
import com.doj.spittr.service.DusrService;

@Controller
public class SpittrUserController {
	@Autowired
	DusrService duService;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String addUsr(@ModelAttribute("dusr") Dusr dusr, BindingResult result, ModelMap model) {
		model.addAttribute("dusr", new Dusr());		
			if(duService.registerUser(dusr)!=null){
				model.put("tab", "Profile");
				model.put("dusr", dusr);
				return "editProfile";
			}
		return "login";
	}

	
	@RequestMapping(value = "/changeProfile", method = RequestMethod.POST)
	public String modifyDetail(@ModelAttribute("dusr") Dusr dusr, BindingResult result, ModelMap model) {
		model.addAttribute("dusr", new Dusr());
		if (duService != null) {
			duService.modifyUser(dusr);
			model.put("tab", "Profile");
			model.put("dusr", dusr);
			return "viewProfile";
		}
		return "login";
	}
	@RequestMapping(value={"/myProfile"})
	public String profile(@ModelAttribute("dusr") Dusr dusr, BindingResult result, ModelMap model){
		model.addAttribute("dusr", new Dusr());
		model.put("tab", "Profile");
		return "viewProfile";
	}
	
	@RequestMapping(value={"/edit"},method=RequestMethod.GET)
	public String editProfile(@ModelAttribute("dusr") Dusr dusr, BindingResult result, ModelMap model,@RequestParam("id") String id){
		Dusr contextUsr=new Dusr();
		contextUsr.setUsrid(Long.parseLong(id.trim()));
		contextUsr=this.duService.getUserDetail(contextUsr);
		model.addAttribute("dusr", contextUsr);
		model.put("tab", "Profile");
		return "editProfile";
	}
	@RequestMapping(value={"/editProfile"})
	public String editProfile(@ModelAttribute("dusr") Dusr dusr, BindingResult result, ModelMap model){
		model.addAttribute("dusr", dusr);
		model.put("tab", "Profile");
		return "editProfile";
	}
	@RequestMapping(value = { "/changePassword" })
	public String changePassword(ModelMap model, @ModelAttribute("dusr") Dusr dusr, BindingResult result,@RequestParam("id") String id, @ModelAttribute("passwordManagement") PasswordManagement passwordManagement) {
		dusr.setUsrid(Long.parseLong(id.trim()));
		model.addAttribute("dusr", dusr);
		model.addAttribute("passwordManagement", new PasswordManagement());
		model.put("tab", "Profile");
		return "changePassword";
	}
	@RequestMapping(value = { "/updatePassword" })
	public String updatePassword(ModelMap model, @ModelAttribute("dusr") Dusr dusr, BindingResult result, @ModelAttribute("passwordManagement") PasswordManagement passwordManagement) {
		dusr.setUsrid(passwordManagement.getUserId());
		dusr =duService.changePassword(passwordManagement);
		dusr.setUsrpwd(null);
		model.addAttribute("dusr", dusr);
		model.put("tab", "Profile");
		return "viewProfile";
	}
	
}
