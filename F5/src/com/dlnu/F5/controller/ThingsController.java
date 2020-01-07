package com.dlnu.F5.controller;

import java.util.List;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.dlnu.F5.pojo.Things;
import com.dlnu.F5.service.ThingsService;

/**
 * 资产流控制器
 *
 */
@Controller
public class ThingsController {
	
	@Autowired
	private ThingsService service;
	
	/**
	 * 增加资产
	 */
	@RequestMapping("/things/add")
	public void add(Things things, HttpServletRequest request, HttpServletResponse response){
		service.addThings(things);
	}
	
	/**
	 * 修改资产信息
	 */
	@RequestMapping("/things/update")
	public void update(Things things, HttpServletRequest request, HttpServletResponse response){
		service.updataThings(things);
	}
	
	/**
	 * 修改资产数量信息
	 */
	@RequestMapping("/things/updateNumber")
	public void updateNumber(Things things, HttpServletRequest request, HttpServletResponse response){
		service.updataNumberThings(things);
	}
	
	/**
	 * 删除资产
	 */
	@RequestMapping("/things/delete")
	public void delete(Integer thingsId, HttpServletRequest request, HttpServletResponse response){
		service.deleteThings(thingsId);
	}
	
	
	
	/**
	 * 按资产id查询信息(列表）
	 */
	@ResponseBody
	@RequestMapping("/things/queryById1")
	public List<Things> queryById1(Integer thingsId, HttpServletRequest request, HttpServletResponse response){
		return service.queryById1(thingsId);
	}
	
	/**
	 * 按资产id查询信息
	 */
	@ResponseBody
	@RequestMapping("/things/queryById")
	public Things queryById(Integer thingsId, HttpServletRequest request, HttpServletResponse response){
		return service.queryById(thingsId);
	}
	
	/**
	 * 按资产名字查询信息
	 */
	@ResponseBody
	@RequestMapping("/things/queryByName")
	public List<Things> queryByName(String thingsName, HttpServletRequest request, HttpServletResponse response){
		return service.queryByName(thingsName);
	}
	
	/**
	 * 按资产类型查询信息
	 */
	@ResponseBody
	@RequestMapping("/things/queryByType")
	public List<Things> queryByType(String thingsType, HttpServletRequest request, HttpServletResponse response){
		return service.queryByType(thingsType);
	}
	
	/**
	 * 查询全部资产
	 */
	@ResponseBody
	@RequestMapping("/things/query")
	public List<Things> query(HttpServletRequest request, HttpServletResponse response){
		return service.query();	
	}
	
}
