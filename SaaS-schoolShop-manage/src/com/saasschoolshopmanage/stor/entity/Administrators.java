package com.saasschoolshopmanage.stor.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Administrators {

	private int id;
	// Î¢ÐÅºÅ
	private String adminWeChat;
	private int shopId;
	// È¨ÏÞ
	private String power;
	private Date timeStamp;

	public Administrators() {
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

	public String getAdminWeChat() {
		return adminWeChat;
	}

	public void setAdminWeChat(String adminWeChat) {
		this.adminWeChat = adminWeChat;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

}
