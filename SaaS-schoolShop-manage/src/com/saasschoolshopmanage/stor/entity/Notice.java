package com.saasschoolshopmanage.stor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Notice {

	private int id;
	// 学生id
	private int stuId;
	// 通知状态
	private boolean staticIs;
	// 种类
	private String catgory;
	// 通知id(对应的上新、活动的id)
	private int notId;

	public void Notice() {
	}

	@Id
	@GeneratedValue(generator = "my_gen")
	@GenericGenerator(name = "my_gen", strategy = "increment")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public boolean isStaticIs() {
		return staticIs;
	}

	public void setStaticIs(boolean staticIs) {
		this.staticIs = staticIs;
	}

	public String getCatgory() {
		return catgory;
	}

	public void setCatgory(String catgory) {
		this.catgory = catgory;
	}

	public int getNotId() {
		return notId;
	}

	public void setNotId(int notId) {
		this.notId = notId;
	}

}
