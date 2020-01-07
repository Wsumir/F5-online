package com.dlnu.F5;
import java.sql.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dlnu.F5.common.Pager;
import com.dlnu.F5.pojo.Emp;
import com.dlnu.F5.pojo.Expatriate;
import com.dlnu.F5.service.ExpatriateService;

public class TestServiceExpatriate {

	
	private ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	private ExpatriateService service = context.getBean(ExpatriateService.class);
	
	@Test
	public void testQuerye(){
		
		List<Expatriate> list=service.query();
		
		System.out.println(list.toString());	
	}
	
	@Test
	public void testQueryByPage() {
		
		Pager pager = new Pager(service.getExpatriateCount(), 10, 0);
		List<Expatriate> list = service.queryExpatriateByPage(pager);
		
		for (Expatriate expatriate :list) {
			System.out.println(expatriate);
		}
	}
	
	@Test
	public void testAddExpatriate(){
		
		Emp emp = new Emp();
		emp.setEmpId(3);
		
		Expatriate expatriate= new Expatriate(emp,"¾©¶«",Date.valueOf("2019-12-12"),8);
		service.AddExpatriate(expatriate);
			
	}
	
	@Test
	public void queryById(){
		
		Expatriate expatriate=service.queryById(12);
		System.err.println(expatriate);
	}
	
	@Test
	public void testdelete(){
		Integer expatriateId=43;
		service.deleteExpatriate(expatriateId);
	}
	

	@Test
	public void testupdate(){
		Expatriate expatriate = new Expatriate();
		expatriate.setExpatriateId(51);
		expatriate.setExpatriateCompany("ÖÐÈí");
		service.updateExpatriate(expatriate);
	}
	

	
}
