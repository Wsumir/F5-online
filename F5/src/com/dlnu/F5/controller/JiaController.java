package com.dlnu.F5.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlnu.F5.pojo.Jia;
import com.dlnu.F5.service.JiaService;

@Controller
public class JiaController {
	
	@Autowired
	private JiaService service;
	
	/**
	 * 按姓名查询
	 */
	@RequestMapping("/jia/queryByName")
	@ResponseBody
	public List<Jia> queryByName(Jia jia,HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession();
		String empLoginName = (String) session.getAttribute("empLoginName");
		List<Jia> list = service.queryByName(empLoginName);
		
		return list;
	}
	
	/**
	 * 增加
	 */
	@RequestMapping("/jia/add")
	public void add(Jia jia, HttpServletRequest request, HttpServletResponse response) {
		
		service.addJia(jia);
	}

}
