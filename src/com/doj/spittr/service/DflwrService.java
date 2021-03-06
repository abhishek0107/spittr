/**
 * 
 */
package com.doj.spittr.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.doj.spittr.entities.Dusr;

/**
 * @author Abhishek
 *
 * 
 */
@Component
public interface DflwrService {

	public List<Dusr> getAllUser();
	public void follow(@ModelAttribute("loginUser") Dusr loginUsr,String followingId);
	public List<Dusr> getFollowingUser(@ModelAttribute("loginUser") Dusr loginUsr);
	public List<Dusr> getMyFollower(@ModelAttribute("loginUser") Dusr loginUsr);
}
