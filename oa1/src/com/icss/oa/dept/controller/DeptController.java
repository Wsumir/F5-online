package com.icss.oa.dept.controller;

import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icss.oa.dept.pojo.Dept;
import com.icss.oa.dept.service.DeptService;

/**
 * 部门控制器
 * @author Administrator
 *
 */
@Controller
public class DeptController {
	@Autowired
	private DeptService service;
	
	/**
	 * 增加部门
	 */
	@RequestMapping("dept/add")
	public void add(Dept dept,HttpServletRequest request,HttpServletResponse response)
	{
		service.addDept(dept);
		System.out.println("dept/add");
	}
	
	@ResponseBody
	@RequestMapping("dept/query")
	public List<Dept> query(HttpServletRequest request,HttpServletResponse response)
	{
		List<Dept> list = service.queryDept();
		return list;
	}
	
	@RequestMapping("dept/update")
	public void update(Dept dept,HttpServletRequest request,HttpServletResponse response)
	{
		service.updateDept(dept);
	}
	
	@RequestMapping("dept/del")
	public void delete(Integer deptId,HttpServletRequest request,HttpServletResponse response){
		
		service.deleteDept(deptId);
	}
	
	@ResponseBody
	@RequestMapping("dept/queryById")
	public Dept queryById(Integer deptId,HttpServletRequest request,HttpServletResponse response)
	{
		return service.queryDeptById(deptId);
	}
	
	
}
