package com.icss.oa.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icss.oa.emp.dao.EmpMapper;
import com.icss.oa.emp.pojo.Emp;

/**
 * 员工业务
 * @author Administrator
 *
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class EmpService {
	
	@Autowired
	private EmpMapper mapper;
	
	/**
	 * 登录验证：
	 * 返回1  用户名不存在
	 * 返回2 密码错误
	 * 返回3 登录成功
	 */
	@Transactional(readOnly=true)
	public int checkLogin(String empLoginName,String empPwd) {
		
		Emp emp = mapper.queryByName(empLoginName);
		
		if (emp == null) {
			return 1;
		} else if (!empPwd.equals(emp.getEmpPwd())) {
			return 2;
		} else {			
			return 3;
		}
		
	}
	
	/**
	 * 增加员工
	 * @param emp
	 */
	public void addEmp(Emp emp) {
		mapper.insert(emp);
	}
	
	/**
	 * 根据登录名返回员工数据
	 */
	public Emp queryEmpByName(String empLoginName) {
		
		return mapper.queryByName(empLoginName);
	}

}