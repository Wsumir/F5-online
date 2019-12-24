package com.icss.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.icss.oa.dept.pojo.Dept;
import com.icss.oa.job.dao.JobMapper;
import com.icss.oa.job.pojo.Job;

public class TestJobMapper {
	
	//核心容器对象
	private ApplicationContext context =
			new ClassPathXmlApplicationContext("applicationContext.xml");
	
	//获得Bean
	private JobMapper mapper = context.getBean(JobMapper.class);
	
	
	@Test
	public void testInsert() {		
		Job job = new Job("会计",5000,15800);
		mapper.insert(job);
	}
	
	@Test
	public void testUpdate() {		
		Job job = new Job(7,"财务人员",5050,15900);
		mapper.update(job);
	}

	@Test
	public void testDelete() {		
		mapper.delete(6);
	}
	
	@Test
	public void testQueryById() {		
		Job job = mapper.queryById(1);
		System.out.println(job);
	}
	
	@Test
	public void testQuery() {		
		List<Job> list = mapper.query();
		
		for (Job job : list) {
			System.out.println(job);
		}
	}
}