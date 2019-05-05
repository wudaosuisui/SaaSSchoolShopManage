package com.saasschoolshopmanage.stor.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Activity {

	private int id;
	private String ActivName;
	private String img;
	private String shopName;
	private int shopId;
	private int adminId;
	private String adminWeChat;
	private String adminWeChatName;
	private int starCount;
	private Date timeStamp;

	public Activity() {
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

	public String getActivName() {
		return ActivName;
	}

	public void setActivName(String activName) {
		ActivName = activName;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminWeChat() {
		return adminWeChat;
	}

	public void setAdminWeChat(String adminWeChat) {
		this.adminWeChat = adminWeChat;
	}

	public String getAdminWeChatName() {
		return adminWeChatName;
	}

	public void setAdminWeChatName(String adminWeChatName) {
		this.adminWeChatName = adminWeChatName;
	}

	public int getStarCount() {
		return starCount;
	}

	public void setStarCount(int starCount) {
		this.starCount = starCount;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public void starCountAdd() {
		this.starCount++;
	}

	public void starCountRed() {
		this.starCount--;
	}
}
