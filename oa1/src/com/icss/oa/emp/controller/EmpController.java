package com.icss.oa.emp.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icss.oa.dept.pojo.Dept;
import com.icss.oa.dept.service.DeptService;
import com.icss.oa.emp.pojo.Emp;
import com.icss.oa.emp.service.EmpService;

import oracle.net.aso.s;
import sun.print.resources.serviceui;

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
	@RequestMapping("/emp/query")
	public List<Emp> query(HttpServletRequest request,HttpServletResponse response)
	{
		return null;
	}
	
	
	
}
