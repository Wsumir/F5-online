package com.dlnu.F5.dao;

import java.util.List;

import com.dlnu.F5.pojo.Room;;

public interface RoomMapper {

	// 根据房间名查询使用情况
	List<Room>  query();

}
