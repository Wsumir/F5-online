package com.dlnu.F5;

import java.sql.Date;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dlnu.F5.pojo.Emp;
import com.dlnu.F5.pojo.Expatriate;
import com.dlnu.F5.service.EmpService1;
import com.dlnu.F5.service.ExpatriateService;

public class TestServiceEmp {

	
	private ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	private EmpService1 service = context.getBean(EmpService1.class);
	
	
	
	@Test
	public void testSendMail() throws AddressException, MessagingException, InterruptedException
	{
		
		Integer integer = service.checkEmail(1);
		System.out.println(integer);
	}
	
	
}
