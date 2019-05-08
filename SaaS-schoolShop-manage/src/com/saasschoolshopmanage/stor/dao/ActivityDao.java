package com.saasschoolshopmanage.stor.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.saasschoolshopmanage.stor.entity.Activity;

@Repository
public class ActivityDao {
	@Resource
	private SessionFactory sessionFactory;

	public List<Activity> getList() {
		Query q = this.sessionFactory.getCurrentSession().createQuery("from Activity");
		return q.list();
	}
}
