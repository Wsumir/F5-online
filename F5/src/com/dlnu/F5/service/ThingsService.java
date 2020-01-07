package com.dlnu.F5.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dlnu.F5.dao.ThingsMapper;
import com.dlnu.F5.pojo.Things;

/**
 * 资产业务
 * @author Administrator
 *
 */
@Service
public class ThingsService {

	@Autowired
	private ThingsMapper mapper;
	
	public void addThings(Things things){
		mapper.insert(things);
	}
	
	public void updataThings(Things things){
		mapper.update(things);
	}
	
	public void deleteThings(Integer thingsId){
		mapper.delete(thingsId);
	}
	
	/**
	 * 更新资产使用数量
	 */
	public void updataNumberThings(Things things){
		mapper.updateNumber(things);
	}
	
	/**
	 * 根据资产id查询资产(列表)
	 */
	@Transactional(readOnly=true)
	public List<Things> queryById1(Integer thingsId){
		return mapper.queryById1(thingsId);
	}
	
	/**
	 * 根据资产id查询资产
	 */
	@Transactional(readOnly=true)
	public Things queryById(Integer thingsId){
		return mapper.queryById(thingsId);
	}
	
	/**
	 * 根据资产名字查询资产
	 */
	@Transactional(readOnly=true)
	public List<Things> queryByName(String thingsName){
		return mapper.queryByName(thingsName);
	}
	
	/**
	 * 根据资产类型查询资产
	 */
	@Transactional(readOnly=true)
	public List<Things> queryByType(String thingsType){
		return mapper.queryByType(thingsType);
	}
	
	/**
	 * 查询所有资产信息
	 */
	@Transactional(readOnly=true)
	public List<Things> query() {		 
		return mapper.query();
	}
	

}
