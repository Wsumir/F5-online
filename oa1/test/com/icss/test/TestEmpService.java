package com.icss.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.icss.oa.emp.dao.EmpMapper;
import com.icss.oa.emp.pojo.Emp;
import com.icss.oa.emp.service.EmpService;

public class TestEmpService {

	private ApplicationContext context 
			= new ClassPathXmlApplicationContext("applicationContext.xml");
	
	//获得Bean对象
	private EmpService service = context.getBean(EmpService.class);
	
	@Test
	public void testCheckLogin() {		
		
		int result = service.checkLogin("zhangsan", "123456");
		System.out.println(result);
		
	}
	
	@Test
	public void testQueryEmpByName() {
		
		Emp emp = service.queryEmpByName("zhangsan");
		System.out.println(emp);
		
	}
	
}