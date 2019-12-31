package com.dlnu.F5.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlnu.F5.pojo.Emp;
import com.dlnu.F5.pojo.Expatriate;
import com.dlnu.F5.service.EmpService;

/**
 * 职员控制器
 * @author Administrator
 *
 */
@Controller
public class EmpController {
	@Autowired
	private EmpService service;
	
	
	@ResponseBody
	@RequestMapping("/emp/login")
	public int login(Emp emp,HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println("/emp/login");
		int result=service.cherkLogin(emp.getEmpLoginName(), emp.getEmpPwd());
		System.out.println(result);
		//登录成功，记录登录状态
		if(result==3){
			HttpSession session = request.getSession();
			session.setAttribute("empLoginName", emp.getEmpLoginName());	
		}
		
		return result;
	}
	
	@ResponseBody
	@RequestMapping("/emp/queryById")
	public Emp queryById(Integer empId,HttpServletRequest request,HttpServletResponse response)
	{
		Emp emp=service.queryById(empId);
		
		return emp;
	}
	
	@ResponseBody
	@RequestMapping("/emp/queryByName")
	public Emp queryByName(String empLoginName,HttpServletRequest request,HttpServletResponse response)
	{
//		String loginName = (String)request.getSession().getAttribute("empLoginName");
		System.out.println("/emp/queryByName");
		Emp emp=service.queryByName(empLoginName);
		return emp;
	}
	
	@ResponseBody
	@RequestMapping("/emp/queryName")
	public Emp queryName(HttpServletRequest request,HttpServletResponse response)
	{
		String loginName = (String)request.getSession().getAttribute("empLoginName");
		
		Emp emp=service.queryByName(loginName);
		return emp;
	}
	
	@ResponseBody
	@RequestMapping("/emp/checkEmail")
	public String checkEmail(HttpServletRequest request,HttpServletResponse response)
	{
		
		
		return null;
	}
	
}
