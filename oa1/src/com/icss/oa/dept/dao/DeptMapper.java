package com.icss.oa.dept.dao;

import java.util.List;

import com.icss.oa.dept.pojo.Dept;

/**
 * ≤ø√≈dao
 * @author Administrator
 *
 */
public interface DeptMapper {
	
	void insert(Dept dept);
	void update(Dept dept);
	void delete(Integer integer);
	Dept queryById(Integer integer);
	List<Dept> query();
}