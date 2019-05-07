package com.saasschoolshopmanage.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/Students")
public class StudentsController {

	@RequestMapping(value = "/getHomepage")
	public String getHomepage(HttpServletRequest request) {
		HttpSession sessionh = request.getSession();
		List<String> classes = new ArrayList<String>();
		classes.add("����");
		classes.add("��ӡ��");
		classes.add("�����");
		classes.add("���");
		classes.add("ʳ��");
		classes.add("��װ��");
		sessionh.setAttribute("classes", classes);

		List<String> types = new ArrayList<String>();
		types.add("�����ֻ���");
		types.add("����Ʒ");
		types.add("һ����");
		types.add("ȡ��");
		types.add("һ��ͨ��ֵ");
		types.add("��Ь");
		types.add("��������");
		types.add("��ʳһ����");
		types.add("С��");
		types.add("���ͳ���");
		types.add("��ӡ");
		sessionh.setAttribute("types", types);

		System.out.println(" get getClass success!!");
		return "/Student/homepage";
	}
}
