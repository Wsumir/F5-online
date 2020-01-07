package com.dlnu.F5.dao;

import java.util.List;

import com.dlnu.F5.pojo.Dept;

public interface DeptMapper {
	void insert(Dept dept);

	void update(Dept dept);
	
	void delete(Integer deptId);
	
	Dept queryById(Integer deptId);
	
	List<Dept> query();
}
