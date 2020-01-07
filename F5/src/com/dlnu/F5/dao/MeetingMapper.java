package com.dlnu.F5.dao;

import java.util.List;

import com.dlnu.F5.pojo.Meeting;

/**
 * 会议dao
 * 
 * @author Administrator
 *
 */
public interface MeetingMapper {
	
	//查询所有会议预约情况
	List<Meeting> query();

	//按姓名查询参加的会议
	List<Meeting> queryByName(String empLoginName);
	
	//删除会议
	void delete(Integer meetingId);
	
	//增加会议
	void insert(Meeting meeting );
	
	//修改时间
	void update(Integer meetingId);
}
