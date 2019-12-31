package com.dlnu.F5;

import java.util.Random;

import com.dlnu.F5.util.SendEmail;

public class testProperties {

	public static void main(String[] args) throws Exception {
		
//		SendEmail.send("244854405@qq.com","hahaha");
		
		System.out.println(rand());
		
	}
	public static Integer rand()
	{

		int max=1000000,min=100000;
		int random = (int) (Math.random()*(max-min)+min); 
		System.out.println(random);
	
		return random;
	}
}
