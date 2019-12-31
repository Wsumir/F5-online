package com.dlnu.F5.dao;

import com.dlnu.F5.pojo.Emp;
import com.dlnu.F5.pojo.Expatriate;

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
	
	Emp queryById(Integer empId);
	

}