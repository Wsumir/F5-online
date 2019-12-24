package com.icss.test;

import static org.hamcrest.CoreMatchers.instanceOf;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.icss.oa.emp.dao.EmpMapper;
import com.icss.oa.emp.pojo.Emp;
import com.icss.oa.emp.service.EmpService;

public class TestEmpService {

	private ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	private EmpService service = context.getBean(EmpService.class);
	
	@Test
	public void testQueryByName(){
		
		int result=service.cherkLogin("zhangsan", "123456");
		
		System.out.println(result);
	}

}
