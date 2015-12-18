package com.doj.spittr.repositories;

import java.util.List;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.doj.spittr.entities.Dlgn;
@Repository
@Transactional
public class LoginDaoImpl implements LoginDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Dlgn> getUserDetail(String email,String password) {
			 
		Session session = this.sessionFactory.openSession(); 
		Query query=session.createQuery("from Dlgn where LGNUN=:email AND LGNPWD=:pwd");
		query.setParameter("email", email);
		query.setParameter("pwd", password);
		@SuppressWarnings("unchecked")
		List<Dlgn> dlgn=query.list();
		if(dlgn!=null && !dlgn.isEmpty()){
			return dlgn;
		}
		
		
		return null;
	}
	
}
