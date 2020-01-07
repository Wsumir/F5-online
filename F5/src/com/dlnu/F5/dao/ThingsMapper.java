package com.dlnu.F5.dao;

import java.util.List;

import com.dlnu.F5.pojo.Things;

public interface ThingsMapper {
	
	//新增资产
    int insert(Things things);
    
    //更新资产
    int update(Things things);
    
    //更新资产数量
    int updateNumber(Things things);
    
    //删除资产
  	void delete(Integer thingsId);
  	
  	Things queryById(Integer thingsId);
  	
  	//根据资产id查询资产(列表)
  	List<Things> queryById1(Integer thingsId);
  	
  	//查询所有资产
  	List<Things> query();
  	
  	//根据资产名字查询资产
  	List<Things> queryByName(String thingsName);
  	
  	//根据资产类型查询工作
  	List<Things> queryByType(String thingstype);
}