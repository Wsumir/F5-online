package com.dlnu.F5.dao;

import java.util.List;

import com.dlnu.F5.pojo.Jia;


public interface JiaMapper {
	
	//按姓名查询请假
		List<Jia> queryByName(String empLoginName);
		
		//增加
		void insert(Jia jia );

}
