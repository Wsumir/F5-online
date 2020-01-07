package com.dlnu.F5.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlnu.F5.pojo.Dept;
import com.dlnu.F5.service.DeptService;
import com.dlnu.F5.pojo.Job;
import com.dlnu.F5.service.JobService;

@Controller
public class JobController {
	

	@Autowired
	private JobService service;
	
//	增加部门
	@RequestMapping("/job/add")
	public void add(Job job,HttpServletRequest request, HttpServletResponse response){
		service.addJob(job);
	}
	
	//查询部门
	@ResponseBody
	@RequestMapping("/job/query")
	public List<Job> query(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		List<Job> list = service.queryDept();
		
		return list;
	}
	
	//修改部门信息
	@RequestMapping("/job/update")
	public void update(Job job ,HttpServletRequest request, HttpServletResponse response){
		service.updateJob(job);
	}
	
	//删除部门
	@RequestMapping("/job/delete")
	public void delete(Integer jobId , HttpServletRequest request, HttpServletResponse response){
		service.deleteJob(jobId);
	}
	
	//根据部门ID查询部门信息
	@ResponseBody
	@RequestMapping("job/queryById")
	public Job queryById(Integer jobId,HttpServletRequest request, HttpServletResponse response){
	
		return service.queryDeptById(jobId);
	}
	
}
