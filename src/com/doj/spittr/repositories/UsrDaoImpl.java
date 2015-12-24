package com.doj.spittr.repositories;

import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.doj.spittr.entities.Dflwr;
import com.doj.spittr.entities.Dusr;
import com.doj.spittr.entities.PasswordManagement;

@Repository
@Transactional
public class UsrDaoImpl implements UsrDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public Dusr registerUser(Dusr dusr) {		
		Session session = this.sessionFactory.openSession();	
		Query query=session.createQuery("from Dusr where usreml=:email");
		query.setParameter("email", dusr.getUsreml());
		List<Dusr> usr=query.list();
		if(usr!=null && !usr.isEmpty()){
			return null;
		}
		String password[]=dusr.getUsrpwd().trim().split(",");
		dusr.setUsrpwd(password[0]);
		Transaction tx=session.beginTransaction();
		Long usrId=(Long)session.save(dusr);
		dusr.setUsrid(usrId);
		tx.commit();
		session.close();
		return dusr;
	}
	@Override
	public Dusr modifyUser(Dusr dusr) {
		Session session = this.sessionFactory.openSession();		
		Transaction tx=session.beginTransaction();
		session.update(dusr);
		tx.commit();
		session.close();
		return dusr;
	}
	@Override
	public Dusr getUserDetail(Dusr dusr) {
		Session session = this.sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		dusr=(Dusr) session.get(Dusr.class, dusr.getUsrid());
		session.close();
		return dusr;

	}
	public Dusr changePassword(PasswordManagement passwordManagement){
		Dusr currentUserDetail=null;
		Session session = this.sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		currentUserDetail=(Dusr) session.get(Dusr.class, passwordManagement.getUserId());
		if(currentUserDetail!=null){
			Query query=session.createQuery("UPDATE Dusr SET USRPWD=:pwd where USRID=:USRID");
			query.setParameter("USRID", currentUserDetail.getUsrid());
			if(currentUserDetail.getUsrpwd().equals(passwordManagement.getCurrentPassword())){

				String password[]=passwordManagement.getNewPassword().trim().split(",");

				if(password.length==2 && password [0].equals(password[1])){
					query.setParameter("pwd", password [0]);
					query.executeUpdate();
					tx.commit();
					session.close();
				}
			}
		}
		return currentUserDetail;
	}


}
