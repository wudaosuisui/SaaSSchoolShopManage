package com.saasschoolshopmanage.stor.log;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import com.saasschoolshopmanage.stor.entity.Student;

@Entity
public class StudentsActivLog {

	private int id;
	// ѧ��id
	private int StuId;
	// ѧ��ѧԺ
	private String StuAcademy;
	// ѧ�����
	private String StuYear;
	// ��������
	private String StuActiv;
	// ʱ���
	private Date timeStamp;

	public void StudentsActive() {
	}

	public void StudentsActive(Student student, String StuActiv) {
		this.StuId = student.getId();
		this.StuAcademy = student.getAcademy();
		this.StuYear = student.getYear();
		this.StuActiv = StuActiv;
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

	public int getStuId() {
		return StuId;
	}

	public void setStuId(int stuId) {
		StuId = stuId;
	}

	public String getStuAcademy() {
		return StuAcademy;
	}

	public void setStuAcademy(String stuAcademy) {
		StuAcademy = stuAcademy;
	}

	public String getStuYear() {
		return StuYear;
	}

	public void setStuYear(String stuYear) {
		StuYear = stuYear;
	}

	public String getStuActiv() {
		return StuActiv;
	}

	public void setStuActiv(String stuActiv) {
		StuActiv = stuActiv;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

}
