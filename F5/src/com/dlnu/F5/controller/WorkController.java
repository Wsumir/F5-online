package com.dlnu.F5.controller;

import java.util.HashMap;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.quartz.utils.StringKeyDirtyFlagMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlnu.F5.common.Pager;
import com.dlnu.F5.pojo.Work;
import com.dlnu.F5.service.WorkService;

/**
 * 工作流控制器
 *
 */
@Controller
public class WorkController {
	
	@Autowired
	private WorkService service;
	
	/**
	 * 增加工作
	 */
	@RequestMapping("/work/add")
	public void add(Work work, HttpServletRequest request, HttpServletResponse response){
		service.addWork(work);
	}
	
	/**
	 * 修改部门信息
	 */
	@RequestMapping("/work/update")
	public void update(Work work, HttpServletRequest request, HttpServletResponse response){
		service.updataWork(work);
	}
	
	/**
	 * 删除工作
	 */
	@RequestMapping("/work/delete")
	public void delete(Integer workId, HttpServletRequest request, HttpServletResponse response){
		service.deleteWork(workId);
	}
	
	/**
	 * 按接收人名字查询信息
	 */
	@ResponseBody
	@RequestMapping("/work/queryByToName")
	public List<Work> queryByToName(String workToName, HttpServletRequest request, HttpServletResponse response){

		return service.queryWorkByToName(workToName);
	}
		
	/**
	 * 按发送人名字查询信息
	 */
	@ResponseBody
	@RequestMapping("/work/queryByFromName")
	public List<Work> queryByFromToName(String workFromName, HttpServletRequest request, HttpServletResponse response){

		return service.queryWorkByFromName(workFromName);
	}
	
	/**
	 * 按id查询信息
	 */
	@ResponseBody
	@RequestMapping("/work/queryById")
	public Work queryById(Integer workId, HttpServletRequest request, HttpServletResponse response){
		return service.queryWorkById(workId);
	}
	
	/**
	 * 查询全部工作
	 */
	@ResponseBody
	@RequestMapping("/work/query")
	public List<Work> query(HttpServletRequest request, HttpServletResponse response){
		return service.query();		
	}
	
	/**
	 * 分页查询工作
	 */
	@RequestMapping("/work/queryByPage")
	@ResponseBody
	public HashMap<String, Object> queryByPager(Integer pageNum,Integer pageSize,HttpServletRequest request, HttpServletResponse response) {

		Pager pager = new Pager(service.getWorkCount(), pageSize, pageNum);
		List<Work> list = service.queryWorkByPage(pager);
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("list", list);
		
		return map;
	}
}
