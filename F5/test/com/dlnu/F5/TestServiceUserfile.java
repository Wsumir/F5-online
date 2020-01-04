package com.dlnu.F5;

import java.sql.Date;
import java.util.List;

import org.apache.tomcat.jni.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dlnu.F5.pojo.Emp;
import com.dlnu.F5.pojo.Expatriate;
import com.dlnu.F5.pojo.Userfile;
import com.dlnu.F5.service.ExpatriateService;
import com.dlnu.F5.service.UserfileService;

public class TestServiceUserfile {

	
	private ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	private UserfileService service = context.getBean(UserfileService.class);
	
	
	@Test
	public void queryById(){
		
		List<Userfile> list = service.queryById(7);
		for(Userfile userfile :list)
		{
			System.out.println(userfile.toString());
			
		}
	}
	
	@Test
	public void queryId(){
		
		String path = service.queryId(5);
		
		System.out.println(path);
			
		
	}
	
	@Test
	public void insert(){
		
		Userfile userfile=new Userfile();
		Emp emp= new Emp();
		emp.setEmpId(1);
		
		userfile.setEmp(emp);
		userfile.setFileName("qqqqqqqq");
		service.insert(userfile);
		
	}
	@Test
	public void delete(){
		
		service.delete(3);
		
	}
	
	

	
}
