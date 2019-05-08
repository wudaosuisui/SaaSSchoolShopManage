package com.saasschoolshopmanage.service;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import com.saasschoolshopmanage.stor.dao.GoodsDao;
import com.saasschoolshopmanage.stor.dao.StudentDao;
import com.saasschoolshopmanage.stor.entity.Goods;

@Service
public class StudentsService {
	@Resource
	private SessionFactory sessionFactory;
	@Resource
	private StudentDao studenDao;
	@Resource
	private GoodsDao goodsDao;

	public List<Goods> getGoodsList() {
		Session session = sessionFactory.openSession();
		List<Goods> goodsList = goodsDao.getList();
		session.close();
		return goodsList;
	}

}
