package com.dlnu.F5.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SendUser {
	private static String sendUser;

	public static String getSendUser(){

		return sendUser;
	}
	
	static{
		
		Properties property = new Properties();

		try {
			property.load(new FileInputStream("config/mail.properties"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		sendUser= property.getProperty("sendUserEmail");

	}
	

}
