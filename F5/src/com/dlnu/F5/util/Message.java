package com.dlnu.F5.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;

public class Message {

	private  String  alert;   //
	
	private  List<String>  names;
	
	private  String  sendMsg;
	
	private String  from;
	
	private String  date;
	
	private String Welcome;
	
	private List<String> usernames;
	
	private String content;
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public void setContent(String name,String msg) {
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		this.content = name+" "+ sdf.format(d)+":<br/>"+msg+"<br/>";
	}

	public String getWelconme() {
		return Welcome;
	}

	public void setWelcome(String msg) {
		Welcome = msg;
	}

	public List<String> getUsernames() {
		return usernames;
	}

	public void setUsernames(List<String> usernames) {
		this.usernames = usernames;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSendMsg() {
		return sendMsg;
	}

	public void setSendMsg(String sendMsg) {
		this.sendMsg = sendMsg;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getAlert() {
		return alert;
	}

	public void setAlert(String alert) {
		this.alert = alert;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String toJson(){
		
		return gson.toJson(this);
	}
	
	private static Gson gson = new Gson();

	
	
	
}
