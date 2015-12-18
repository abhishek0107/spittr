package com.doj.spittr.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.doj.spittr.entities.Dlgn;
@Component
public interface LgnService {
 public  List<Dlgn> getLoginDetailByUname(String Uname,String password);
}
