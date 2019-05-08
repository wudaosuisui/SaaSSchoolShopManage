package com.saasschoolshopmanage.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saasschoolshopmanage.service.StudentsService;
import com.saasschoolshopmanage.stor.entity.Activity;
import com.saasschoolshopmanage.stor.entity.Goods;

@Controller
@RequestMapping(value = "/Students")
public class StudentsController {
	@Resource
	private StudentsService studentsService;

	@RequestMapping(value = "/peoplepage/huodong")
	public String peoHuoDong(HttpServletRequest request) {
		huoDong(request);
		HttpSession sessionh = request.getSession();
		sessionh.setAttribute("at", "people");
		return "/Student/peoplepage";
	}

	@RequestMapping(value = "/peoplepage/shangxin")
	public String peoShangXin(HttpServletRequest request) {
		shangXin(request);
		HttpSession sessionh = request.getSession();
		sessionh.setAttribute("at", "people");
		return "/Student/peoplepage";
	}

	@RequestMapping(value = "/hotpage/huodong")
	public String huoDong(HttpServletRequest request) {
		HttpSession sessionh = request.getSession();
		sessionh.setAttribute("at", "hot");
		sessionh.setAttribute("oneOf", "huodong");
		sessionh.setAttribute("activitysList", studentsService.getActivitysList());
		List<Activity> acList = studentsService.getActivitysList();
		for (Activity ac : acList) {
			System.out.println(ac.getActivName() + " , " + ac.getImg());
		}
		return "/Student/hotpage";
	}

	@RequestMapping(value = "/hotpage/shangxin")
	public String shangXin(HttpServletRequest request) {
		HttpSession sessionh = request.getSession();
		sessionh.setAttribute("at", "hot");
		sessionh.setAttribute("oneOf", "shangxin");
		sessionh.setAttribute("goodsList", studentsService.getGoodsList());
		List<Goods> goodsList = studentsService.getGoodsList();
		for (Goods goods : goodsList) {
			System.out.println(goods.getGoodsName() + " , " + goods.getPrice());
		}

		return "/Student/hotpage";
	}

	@RequestMapping(value = "/gethotpage")
	public String jumpToHotPage(HttpServletRequest request) {
		HttpSession sessionh = request.getSession();
		sessionh.setAttribute("at", "hot");
		sessionh.setAttribute("oneOf", "shangxin");

		return "/Student/hotpage";
	}

	@RequestMapping(value = "/getpeoplepage")
	public String jumpToPeoplePage(HttpServletRequest request) {
		HttpSession sessionh = request.getSession();
		sessionh.setAttribute("at", "people");
		return "/Student/peoplepage";
	}

	@RequestMapping(value = "/gethomepage")
	public String getHomepage(HttpServletRequest request) {
		HttpSession sessionh = request.getSession();
		sessionh.setAttribute("at", "home");
		List<String> classes = new ArrayList<String>();
		classes.add("超市");
		classes.add("打印店");
		classes.add("照相馆");
		classes.add("书店");
		classes.add("食堂");
		classes.add("服装店");
		sessionh.setAttribute("classes", classes);

		List<String> types = new ArrayList<String>();
		types.add("办理手机卡");
		types.add("日用品");
		types.add("一寸照");
		types.add("取款");
		types.add("一卡通充值");
		types.add("黑鞋");
		types.add("购物中心");
		types.add("美食一条街");
		types.add("小吃");
		types.add("大型超市");
		types.add("打印");
		sessionh.setAttribute("types", types);

		System.out.println(" get getClass success!!");
		return "/Student/homepage";
	}
}
