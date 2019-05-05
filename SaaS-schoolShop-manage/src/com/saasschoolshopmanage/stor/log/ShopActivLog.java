package com.saasschoolshopmanage.stor.log;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import com.saasschoolshopmanage.stor.entity.Shop;

@Entity
public class ShopActivLog {

	private int id;
	private int shopId;
	private String shopType;
	private String shopActiv;
	private Date timeStamp;

	public ShopActivLog() {
	}

	public ShopActivLog(Shop shop, String shopActiv) {
		this.shopId = shop.getId();
		this.shopType = shop.getType();
		this.shopActiv = shopActiv;
		this.timeStamp = new Date();
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

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopType() {
		return shopType;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getShopActiv() {
		return shopActiv;
	}

	public void setShopActiv(String shopActiv) {
		this.shopActiv = shopActiv;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

}
