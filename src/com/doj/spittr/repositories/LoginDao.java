package com.doj.spittr.repositories;

import java.util.List;

import org.springframework.stereotype.Component;

import com.doj.spittr.entities.Dlgn;
@Component
public interface LoginDao {
	public  List<Dlgn> getUserDetail(String email,String password);
	
}
