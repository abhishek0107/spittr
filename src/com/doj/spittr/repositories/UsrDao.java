package com.doj.spittr.repositories;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.doj.spittr.entities.Dusr;
import com.doj.spittr.entities.PasswordManagement;

@Component
public interface UsrDao {
	public Dusr registerUser(Dusr dusr);
	public Dusr modifyUser(Dusr dusr);
	public Dusr getUserDetail(Dusr dusr);
	public Dusr changePassword(PasswordManagement passwordManagement);
	
}
