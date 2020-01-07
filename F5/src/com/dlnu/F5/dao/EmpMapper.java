package com.dlnu.F5.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dlnu.F5.pojo.Emp;

/**
 * 员工dao
 * 
 * @author Administrator
 *
 */
public interface EmpMapper {

	//根据登录名查询员工数据
	Emp queryByNameZsh(String empLoginName);
	
	//获得总记录数
	int getCountZsh();	
		
	//分页查询员工
	List<Emp> queryByPageZsh(@Param("start")int start,@Param("pageSize")int pageSize);
	
	//lyl

	// 根据登录名查询员工数据
	Emp queryByName(String empLoginName);

	void insert(Emp emp);

	void updatePwdByName(Emp emp);

	////修改员工
	void update(Emp emp);

	// 更新用户头像
	void updatePic(@Param("empLoginName") String empLoginName, @Param("empPic") String empPic);

	// 获得总记录数
	int getCount();

	// 分页查询员工
	List<Emp> queryByPage(@Param("start") int start, @Param("pageSize") int pageSize);
	
	/*zgz*/
	// 分页查询员工
			List<Emp> queryByPagezgz(@Param("start") int start, @Param("pageSize") int pageSize);
			
			//根据id查询员工数据
			List<Emp> queryByIdzgz(Integer empId);
			
			//根据deptid查询员工数据
			List<Emp> queryByDeptIdzgz(Integer deptId);
					
			//根据jobid查询员工数据
			List<Emp> queryByJobIdzgz(Integer jobId);
}