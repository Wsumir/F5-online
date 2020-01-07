package com.dlnu.F5.controller;

import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlnu.F5.pojo.Dept;
import com.dlnu.F5.service.DeptService;

@Controller
public class DeptController {

	@Autowired
	private DeptService service;
	
//	增加部门
	@RequestMapping("/dept/add")
	public void add(Dept dept,HttpServletRequest request, HttpServletResponse response){
		service.addDept(dept);
	}
	
	//查询部门
	@ResponseBody
	@RequestMapping("/dept/query")
	public List<Dept> query(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		List<Dept> list = service.queryDept();
		
		return list;
	}
	
	//修改部门信息
	@RequestMapping("/dept/update")
	public void update(Dept dept,HttpServletRequest request, HttpServletResponse response){
		service.updateDept(dept);
	}
	
	//删除部门
	@RequestMapping("/dept/delete")
	public void delete(Integer deptId , HttpServletRequest request, HttpServletResponse response){
		service.deleteDept(deptId);
	}
	
	//根据部门ID查询部门信息
	@ResponseBody
	@RequestMapping("/dept/queryById")
	public Dept queryById(Integer deptId,HttpServletRequest request, HttpServletResponse response){
	
		return service.queryDeptById(deptId);
	}
	

}
