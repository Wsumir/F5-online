package com.dlnu.F5.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlnu.F5.pojo.Room;
import com.dlnu.F5.service.RoomService;

/**
 * ª·“È “øÿ÷∆∆˜
 * 
 * @author Administrator
 *
 */
@Controller
public class RoomController {
	
	@Autowired
	private RoomService service;
	
	@ResponseBody
	@RequestMapping("/room/query")
	public List<Room> query(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		List<Room> list = service.queryRoom();
		
		return list;
	}
	

}
