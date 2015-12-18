package com.doj.spittr.service;

import org.springframework.stereotype.Component;

import com.doj.spittr.entities.Dusr;
@Component
public interface DusrService {
	public void registerUser(Dusr dusr);

}
