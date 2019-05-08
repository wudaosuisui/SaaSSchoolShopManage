package com.saasschoolshopmanage.stor.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.saasschoolshopmanage.stor.entity.Goods;

@Repository
public class GoodsDao {
	@Resource
	private SessionFactory sessionFactory;

	public List<Goods> getList() {
		Query q = this.sessionFactory.getCurrentSession().createQuery("from Goods");
		return q.list();
	}
}
