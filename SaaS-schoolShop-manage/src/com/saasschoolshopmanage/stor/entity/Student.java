package com.saasschoolshopmanage.stor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Student {

	private int id;
	// ��½id
	private int logInId;
	// ��½�û������˺ţ�
	private String userLoginName;
	// �û��ǳ�
	private String userName;
	// ͷ��
	private String headPortrait;
	// �ȼ�
	private String level;
	// ѧԺ
	private String academy;
	// ��ѧ���
	private String year;
	// ǩ��
	private String describe;
	// �ֻ���
	private String phoneNum;
	// ��ʵ����
	private String trueNume;
	// ���������Ƭ
	private String trialPhoto;

	public Student() {
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

	public int getLogInId() {
		return logInId;
	}

	public void setLogInId(int logInId) {
		this.logInId = logInId;
	}

	public String getUserLoginName() {
		return userLoginName;
	}

	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getHeadPortrait() {
		return headPortrait;
	}

	public void setHeadPortrait(String headPortrait) {
		this.headPortrait = headPortrait;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getAcademy() {
		return academy;
	}

	public void setAcademy(String academy) {
		this.academy = academy;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getTrueNume() {
		return trueNume;
	}

	public void setTrueNume(String trueNume) {
		this.trueNume = trueNume;
	}

	public String getTrialPhoto() {
		return trialPhoto;
	}

	public void setTrialPhoto(String trialPhoto) {
		this.trialPhoto = trialPhoto;
	}

}
