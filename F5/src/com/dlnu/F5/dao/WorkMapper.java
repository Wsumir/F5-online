package com.dlnu.F5.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dlnu.F5.pojo.Emp;
import com.dlnu.F5.pojo.Work;

public interface WorkMapper {
	
	//新增工作
	void insert(Work work);
	
	//更新工作
	void update(Work work);
	
	//删除工作
	void delete(Integer workId);
	
	//根据接收人查询工作信息
	List<Work> queryByToName(String workToName);
	
	//根据发送人查询工作信息
	List<Work> queryByFromName(String workFromName);
	
	//根据工作id查询工作
	Work queryById(Integer workId);
	
	//查询所有工作
	List<Work> query();
	
	//获得总记录数
	int getCount();	
		
	//分页查询工作
	List<Work> queryByPage(@Param("start")int start,@Param("pageSize")int pageSize);

}