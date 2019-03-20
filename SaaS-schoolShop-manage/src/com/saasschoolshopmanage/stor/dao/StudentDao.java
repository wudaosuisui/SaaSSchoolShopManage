package com.saasschoolshopmanage.stor.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.saasschoolshopmanage.stor.entity.StudentLogIn;

@Repository
public class StudentDao {

	@Resource
	private SessionFactory sessionFactory;

	public void inster(StudentLogIn studentLogIn) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tra = session.beginTransaction();
		session.save(studentLogIn);
		session.flush();
		tra.commit();
	}

}
