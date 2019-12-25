package com.icss.oa.job.controller;

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
import com.icss.oa.job.pojo.Job;
import com.icss.oa.job.service.JobService;

/**
 * 部门控制器
 * @author Administrator
 *
 */
@Controller
public class JobController {
	@Autowired
	private JobService service;
	
	/**
	 * 增加部门
	 */
	@RequestMapping("job/add")
	public void add(Job job,HttpServletRequest request,HttpServletResponse response)
	{
		service.addJob(job);
		System.out.println("job/add");
	}
	
	@ResponseBody
	@RequestMapping("job/query")
	public List<Job> query(HttpServletRequest request,HttpServletResponse response)
	{
		List<Job> list = service.queryJob();
		return list;
	}
	
	@RequestMapping("job/update")
	public void update(Job job,HttpServletRequest request,HttpServletResponse response)
	{
		service.updateJob(job);
	}
	
	@RequestMapping("job/del")
	public void delete(Integer jobId,HttpServletRequest request,HttpServletResponse response){
		
		service.deleteJob(jobId);
	}
	
	@ResponseBody
	@RequestMapping("job/queryById")
	public Job queryById(Integer jobId,HttpServletRequest request,HttpServletResponse response)
	{
		return service.queryDeptById(jobId);
	}
	
	//test
}
