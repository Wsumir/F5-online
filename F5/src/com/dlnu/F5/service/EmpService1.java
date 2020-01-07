package com.dlnu.F5.service;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dlnu.F5.common.Pager;
import com.dlnu.F5.dao.EmpMapper1;
import com.dlnu.F5.pojo.Emp;
import com.dlnu.F5.pojo.Expatriate;
import com.dlnu.F5.util.SendEmail;
import com.sun.mail.handlers.message_rfc822;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

/**
 * 员工模块相关业务
 * @author Administrator
 *
 */

@Service
@Transactional(rollbackFor=Exception.class)
public class EmpService1 {

	@Autowired
	private EmpMapper1 mapper;
	
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
	
	public Emp queryByName(String empLoginName)
	{
		Emp emp = mapper.queryByName(empLoginName);
		return emp;
	}
	
	
	public Emp queryById(Integer empId){
		Emp emp = mapper.queryById(empId);
		return emp;
	}
	
	public Integer checkEmail(Integer empId) throws AddressException, MessagingException, InterruptedException
	{
		Emp emp= mapper.queryById(empId);
		
		String email = emp.getEmpEmail();
		
		System.out.println(email);
		
		int max=1000000,min=100000;
		int random = (int) (Math.random()*(max-min)+min); 
		System.out.println(random);
		
		String message = "【OA系统】,验证码"+random+"您正在进行邮箱验证，如非本人操作，请忽略本信息";
		SendEmail.send(email,message);
		
		return random;
	}
	
	



	
	
}
