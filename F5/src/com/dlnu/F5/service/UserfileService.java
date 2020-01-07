package com.dlnu.F5.service;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dlnu.F5.dao.EmpMapper1;
import com.dlnu.F5.dao.UserfileMapper;
import com.dlnu.F5.pojo.Emp;
import com.dlnu.F5.pojo.Expatriate;
import com.dlnu.F5.pojo.Userfile;
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
public class UserfileService {

	@Autowired
	private UserfileMapper mapper;
	
	
	
	public List<Userfile> queryById(Integer empId){
		List<Userfile> list = mapper.queryById(empId);
		

		return list;
	}
	
	public String queryId(Integer fileId){
		Userfile userfile = mapper.queryId(fileId);
		System.out.println(userfile.getFilePath());
		return userfile.getFilePath();
	}
	
	public void insert(Userfile userfile){
	
		mapper.insert(userfile);	
		
	}
	
	public void delete(Integer fileId){
		
		mapper.delete(fileId);	
		
	}
	
	
	
}
