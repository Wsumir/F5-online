package com.icss.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.icss.oa.dept.dao.DeptMapper;
import com.icss.oa.dept.pojo.Dept;
import com.icss.oa.dept.service.DeptService;

public class TestDeptService {

	//核心容器对象
		private ApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//获得Bean
		private DeptService service = context.getBean(DeptService.class);
		
		
		@Test
		public void testAddDept(){
			Dept dept= new Dept("aaa","aaa");
			service.addDept(dept);
			
		}
		@Test
		public void testdel(){
			service.deleteDept(16);
			
		}
}
