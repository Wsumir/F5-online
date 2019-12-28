package com.icss.oa.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icss.oa.emp.pojo.Emp;
import com.icss.oa.emp.service.EmpService;

/**
 * 员工控制器
 * @author Administrator
 *
 */
@Controller
public class EmpController {
	
	@Autowired
	private EmpService service;
	
	/**
	 * 登录程序
	 * @return
	 */
	@RequestMapping("/emp/login")
	@ResponseBody
	public int login(Emp emp,HttpServletRequest request,HttpServletResponse response) {
		
		int result = service.checkLogin(emp.getEmpLoginName(), emp.getEmpPwd());
		
		//登录成功，记录登录状态
		if (result == 3) {
			HttpSession session = request.getSession();
			session.setAttribute("empLoginName", emp.getEmpLoginName());
		}
		
		return result;		
	}
	
	/**
	 * 增加员工
	 */
	@RequestMapping("/emp/add")
	public void add(Emp emp,HttpServletRequest request,HttpServletResponse response) {
		service.addEmp(emp);
	}
	
	/**
	 * 根据登录名返回员工数据
	 */
	@RequestMapping("/emp/queryByName")
	@ResponseBody
	public Emp queryByName(String empLoginName,HttpServletRequest request,HttpServletResponse response) {
		
		return service.queryEmpByName(empLoginName);
	}
	
}