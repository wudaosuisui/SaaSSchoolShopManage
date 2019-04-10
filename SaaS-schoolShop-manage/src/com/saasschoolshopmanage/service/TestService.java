package com.saasschoolshopmanage.service;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import com.saasschoolshopmanage.stor.dao.StudentDao;
import com.saasschoolshopmanage.stor.entity.StudentLogIn;

@Service
public class TestService {
	@Resource
	private SessionFactory sessionFactory;
	@Resource
	private StudentDao studentDao;

	public void addTest() {
		Session session = sessionFactory.openSession();
		StudentLogIn stu = new StudentLogIn();
		stu.setUserName("testUserName");
		stu.setPassWord("testPassWord");
		studentDao.inster(stu);
		session.close();
	}

}
