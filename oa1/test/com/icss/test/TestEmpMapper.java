package com.icss.test;

import static org.hamcrest.CoreMatchers.nullValue;

import java.sql.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.icss.oa.dept.pojo.Dept;
import com.icss.oa.emp.dao.EmpMapper;
import com.icss.oa.emp.pojo.Emp;
import com.icss.oa.job.pojo.Job;

public class TestEmpMapper {

	private ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	private EmpMapper mapper = context.getBean(EmpMapper.class);
	
	@Test
	public void testQueryByName(){
		
		Emp emp=mapper.queryByName("zhangsan");		
		System.out.println(emp);
	}

	@Test
	public void testinset()
	{
		Dept dept = new Dept();
		dept.setDeptId(1);
		Job job = new Job();
		job.setJobId(1);
		Emp emp = new Emp("tom", "tom", "123456", "tom@163.com", "13812345678"
				, Date.valueOf("2019-12-13"), 8800, dept, job, null, "这个人很懒，什么都没有留下");
		mapper.insert(emp);
	}
}








