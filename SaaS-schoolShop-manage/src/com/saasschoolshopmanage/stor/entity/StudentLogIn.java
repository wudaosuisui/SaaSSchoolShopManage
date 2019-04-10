package com.saasschoolshopmanage.stor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class StudentLogIn {

	private int id;
	private String userName;
	private String passWord;

	public StudentLogIn() {
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
