package com.dlnu.F5.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dlnu.F5.common.Pager;
import com.dlnu.F5.dao.EmpMapper;
import com.dlnu.F5.pojo.Emp;
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
		
		Emp emp = mapper.queryByNameZsh(empLoginName);
		if(emp==null){
			return 1;
		}else if(!empPwd.equals(emp.getEmpPwd())){
			return 2;
		}else {
			return 3;
		}
		
	}
	
	/**
	 * 根据登录名返回员工数据
	 */
	public Emp queryEmpByNameZsh(String empLoginName) {
		
		return mapper.queryByNameZsh(empLoginName);
	}
	
	/**
	 * 获得员工总数
	 */
	public int getEmpCountZsh() {
		
		return mapper.getCountZsh();
	}
	
	/**
	 * 分页查询员工
	 */
	public List<Emp> queryEmpByPageZsh(Pager pager) {
		
		return mapper.queryByPageZsh(pager.getStart(), pager.getPageSize());
	}
	
	
	/**
	 * lyl
	 */
	
	@Transactional(readOnly=true)
	public Emp TestQueryByName(String empLoginName) {
		Emp emp = mapper.queryByName(empLoginName);		
		System.out.println(emp);
		return emp;
	}
	
	@Transactional
	public void UpdatePwdByName(Emp emp){
		mapper.updatePwdByName(emp);
	}
	
	@Transactional
	/**
	 * 修改员工
	 */
	public void updateEmp(Emp emp) {
		mapper.update(emp);
	}
	
	/**
	 * 修改用户头像
	 */
	public void updateEmpPic(String empLoginName,String empPic) {
		mapper.updatePic(empLoginName, empPic);
	}
	
	/**
	 * 获得员工总数
	 */
	public int getEmpCount() {
		
		return mapper.getCount();
	}
	
	
	/**
	 * 分页查询员工
	 */
	@Transactional(readOnly=true)
	public List<Emp> queryEmpByPage(Pager pager) {
		
		return mapper.queryByPage(pager.getStart(), pager.getPageSize());
	}
	
	/**
	 * zgz
	 */
	/**
	 * 分页查询员工
	 */
	public List<Emp> queryEmpByPagezgz(Pager pager) {
		
		return mapper.queryByPagezgz(pager.getStart(), pager.getPageSize());
	}
	
	/**
	 * 根据id返回员工数据
	 */
	public List<Emp> queryEmpByIdzgz(Integer empId) {
		
		return mapper.queryByIdzgz(empId);
	}
	
	/**
	 * 根据deptid返回员工数据
	 */
	public List<Emp> queryEmpByDeptIdzgz(Integer deptId) {
		
		return mapper.queryByDeptIdzgz(deptId);
	}
	
	/**
	 * 根据jobid返回员工数据
	 */
	public List<Emp> queryEmpByJobIdzgz(Integer jobId) {
		
		return mapper.queryByJobIdzgz(jobId);
	}
}


