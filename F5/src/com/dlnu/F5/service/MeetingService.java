package com.dlnu.F5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dlnu.F5.dao.MeetingMapper;
import com.dlnu.F5.pojo.Meeting;

/**
 * 会议模块相关业务
 * @author Administrator
 *
 */

@Service
@Transactional(rollbackFor=Exception.class)
public class MeetingService {
	
	@Autowired
	private MeetingMapper mapper;
	
	/**
	 * 查询会议
	 */
	@Transactional(readOnly=true)
	public List<Meeting> query() {
		
		return mapper.query();
	}
	
	/**
	 * 按姓名查询会议
	 */
	@Transactional(readOnly=true)
	public List<Meeting> queryByName(String empLoginName) {
		
		return mapper.queryByName(empLoginName);
	}
	
	/**
	 * 按id删除会议
	 */
	public void deleteMeeting(Integer meetingId){
		mapper.delete(meetingId);
	}
	
	/**
	 * 增加会议
	 */
	@Transactional
	public void addMeeting(Meeting meeting) {
		mapper.insert(meeting);
	}
	
	/**
	 * 修改时间
	 */
	@Transactional
	public void updateMeeting(Integer meetingId) {
		mapper.update(meetingId);
	}

}
