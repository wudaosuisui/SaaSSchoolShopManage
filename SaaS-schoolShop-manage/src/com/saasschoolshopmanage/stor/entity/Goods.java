package com.saasschoolshopmanage.stor.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Goods {

	private int id;
	private String goodsName;
	private String img;
	private String shopName;
	private int shopId;
	// 编辑管理员id
	private int adminId;
	// 编辑管理员微信号
	private String adminWeChat;
	// 编辑管理员微信名
	private String adminWeChatName;
	// 销售员微信号
	private String salespersonWeChat;
	// 销售员微信二维码
	private String salespersonimg;
	// 喜欢个数
	private int starCount;
	private Date timeStamp;

	public Goods() {
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

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
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

	public String getSalespersonWeChat() {
		return salespersonWeChat;
	}

	public void setSalespersonWeChat(String salespersonWeChat) {
		this.salespersonWeChat = salespersonWeChat;
	}

	public String getSalespersonimg() {
		return salespersonimg;
	}

	public void setSalespersonimg(String salespersonimg) {
		this.salespersonimg = salespersonimg;
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

}
