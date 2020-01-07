package com.dlnu.F5.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Meeting {

	private Integer meetingId;

	private Room room;

	private Emp emp;

	private String meetingContent;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date meetingStart;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date meetingEnd;

	public Meeting() {
		super();
	}

	public Meeting(Room room, Emp emp, String meetingContent, Date meetingStart, Date meetingEnd) {
		super();
		this.room = room;
		this.emp = emp;
		this.meetingContent = meetingContent;
		this.meetingStart = meetingStart;
		this.meetingEnd = meetingEnd;
	}

	public Meeting(Integer meetingId, Room room, Emp emp, String meetingContent, Date meetingStart, Date meetingEnd) {
		super();
		this.meetingId = meetingId;
		this.room = room;
		this.emp = emp;
		this.meetingContent = meetingContent;
		this.meetingStart = meetingStart;
		this.meetingEnd = meetingEnd;
	}

	public Integer getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(Integer meetingId) {
		this.meetingId = meetingId;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public String getMeetingContent() {
		return meetingContent;
	}
	
@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	public void setMeetingContent(String meetingContent) {
		this.meetingContent = meetingContent;
	}

	
	public Date getMeetingStart() {
		return meetingStart;
	}
	
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	public void setMeetingStart(Date meetingStart) {
		this.meetingStart = meetingStart;
	}
	

	public Date getMeetingEnd() {
		return meetingEnd;
	}

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	public void setMeetingEnd(Date meetingEnd) {
		this.meetingEnd = meetingEnd;
	}

	@Override
	public String toString() {
		return "Meeting [meetingId=" + meetingId + ", room=" + room + ", emp=" + emp + ", meetingContent="
				+ meetingContent + ", meetingStart=" + meetingStart + ", meetingEnd=" + meetingEnd + "]";
	}

	
	

}
