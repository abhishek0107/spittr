package com.doj.spittr.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doj.spittr.entities.Dlgn;
import com.doj.spittr.entities.Dusr;
import com.doj.spittr.service.LgnService;
import com.doj.spittr.service.LgnServiceImpl;

@Controller
public class SpittrController {
	
	@Autowired
	private LgnService lgnService;
	
	@RequestMapping(value={"/login"},method={RequestMethod.POST})
	public String login(ModelMap model,@ModelAttribute("dusr")
    Dusr dusr, BindingResult result){		
		model.addAttribute("dusr", new Dusr());		
		String email=dusr.getUsreml();
		String password=dusr.getUsrpwd();		
		if(email!=null && password!=null){
			if(lgnService!=null){
			List<Dlgn> dlgn=lgnService.getLoginDetailByUname(email, password);
			if(null!=dlgn){
				model.put("tab", "Profile");
				model.put("dlgn", dlgn);
				model.addAttribute("dusr", new Dusr());
				return "viewProfile";
			}}
		}
		return "login";
	}
	@RequestMapping(value={"/"})
	public String login(ModelMap model){
		model.addAttribute("dusr", new Dusr());
		model.put("tab", "Profile");
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
	
	@RequestMapping(value={"/home", "/tweets"})
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
		model.put("tab", "Followers");
		return "following";
	}
	@RequestMapping(value = "/register", method = RequestMethod.POST)
    public String addUsr(@ModelAttribute("dusr")
                            Dusr dusr, BindingResult result) {
         
        System.out.println("First Name:" + dusr.getUsrfn()+ 
                    "Last Name:" + dusr.getUsrpwd());
         
        return "login";
    }
     
}
