package com.icss.oa.emp.dao;

import com.icss.oa.emp.pojo.Emp;

/**
 * 员工dao
 * 
 * @author Administrator
 *
 */
public interface EmpMapper {

	//根据登录名查询员工数据
	Emp queryByName(String empLoginName);
	
	void insert(Emp emp);

}