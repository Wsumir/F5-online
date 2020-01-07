package com.dlnu.F5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dlnu.F5.dao.RoomMapper;
import com.dlnu.F5.pojo.Room;

@Service
@Transactional(rollbackFor=Exception.class)
public class RoomService {
	
	@Autowired
	private RoomMapper mapper;
	
	@Transactional(readOnly=true)
	public List<Room> queryRoom(){
		return mapper.query();
	}

}
