package com.dlnu.F5.dao;

import java.util.List;

import com.dlnu.F5.pojo.Userfile;

public interface UserfileMapper {
	
	void insert(Userfile file);
	
	List<Userfile> queryById(Integer empId);
	
	void delete(Integer fileId);
	
	Userfile queryId(Integer fileId);

}
