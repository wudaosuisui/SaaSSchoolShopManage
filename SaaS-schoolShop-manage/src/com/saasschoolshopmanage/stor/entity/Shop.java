package com.saasschoolshopmanage.stor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Shop {

	private int id;
	// ��������
	private String shopName;
	// λ��
	private String position;
	// λ������
	private String positionDescribe;
	// ���̱�ǩ�����ͣ�
	private String type;
	// ��������飩text
	private String destcribe;
	// ���̷���
	private String img;
	// �ܹ���Աid
	private int adminId;
	// ����Աid
	private int salespersonId;
	// ������Ʒid
	private int goodsId;
	// ���̻id
	private int activityId;

	public Shop() {
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

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPositionDescribe() {
		return positionDescribe;
	}

	public void setPositionDescribe(String positionDescribe) {
		this.positionDescribe = positionDescribe;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDestcribe() {
		return destcribe;
	}

	public void setDestcribe(String destcribe) {
		this.destcribe = destcribe;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public int getSalespersonId() {
		return salespersonId;
	}

	public void setSalespersonId(int salespersonId) {
		this.salespersonId = salespersonId;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

}
