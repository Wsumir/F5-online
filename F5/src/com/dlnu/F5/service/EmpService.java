package com.dlnu.F5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dlnu.F5.dao.EmpMapper;
import com.dlnu.F5.pojo.Emp;
import com.dlnu.F5.pojo.Expatriate;

/**
 * 员工模块相关业务
 * @author Administrator
 *
 */

@Service
@Transactional(rollbackFor=Exception.class)
public class EmpService {

	@Autowired
	private EmpMapper mapper;
	
	/**
	 * 登录验证
	 * 返回1 用户名不存在
	 * 返回2 密码错误
	 * 返回3 登录成功
	 */
	@Transactional(readOnly=true)
	public int cherkLogin(String empLoginName,String empPwd){
		
		Emp emp = mapper.queryByName(empLoginName);
		if(emp==null){
			return 1;
		}else if(!empPwd.equals(emp.getEmpPwd())){
			return 2;
		}else {
			return 3;
		}
		
	}
	
	public Emp queryById(Integer empId){
		Emp emp = mapper.queryById(empId);
		return emp;
	}
	
	
	
	
	
	
	
}
