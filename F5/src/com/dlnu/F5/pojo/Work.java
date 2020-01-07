package com.dlnu.F5.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Work {
    private Integer workId;

    private String workFromName;

    private String workToName;

    private String workTitle;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date workTimeStart;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date workTimeEnd;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date workSendTime;

    private String workContent;
    
    private String workAct;
    
    public Work() {
		super();
	}
    
	public Work(String workFromName, String workToName, String workTitle, Date workTimeStart, Date workTimeEnd,
			Date workSendTime, String workContent, String workAct) {
		super();
		this.workFromName = workFromName;
		this.workToName = workToName;
		this.workTitle = workTitle;
		this.workTimeStart = workTimeStart;
		this.workTimeEnd = workTimeEnd;
		this.workSendTime = workSendTime;
		this.workContent = workContent;
		this.workAct = workAct;
	}

	public Work(Integer workId, String workFromName, String workToName, String workTitle, Date workTimeStart,
			Date workTimeEnd, Date workSendTime, String workContent, String workAct) {
		super();
		this.workId = workId;
		this.workFromName = workFromName;
		this.workToName = workToName;
		this.workTitle = workTitle;
		this.workTimeStart = workTimeStart;
		this.workTimeEnd = workTimeEnd;
		this.workSendTime = workSendTime;
		this.workContent = workContent;
		this.workAct = workAct;
	}

	public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public String getWorkFromName() {
        return workFromName;
    }

    public void setWorkFromName(String workFromName) {
        this.workFromName = workFromName == null ? null : workFromName.trim();
    }

    public String getWorkToName() {
        return workToName;
    }

    public void setWorkToName(String workToName) {
        this.workToName = workToName == null ? null : workToName.trim();
    }

    public String getWorkTitle() {
        return workTitle;
    }

    public void setWorkTitle(String workTitle) {
        this.workTitle = workTitle == null ? null : workTitle.trim();
    }

    public Date getWorkTimeStart() {
        return workTimeStart;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public void setWorkTimeStart(Date workTimeStart) {
        this.workTimeStart = workTimeStart;
    }

    public Date getWorkTimeEnd() {
        return workTimeEnd;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public void setWorkTimeEnd(Date workTimeEnd) {
        this.workTimeEnd = workTimeEnd;
    }

    public Date getWorkSendTime() {
        return workSendTime;
    }
    
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public void setWorkSendTime(Date workSendTime) {
        this.workSendTime = workSendTime;
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent == null ? null : workContent.trim();
    }

	public String getWorkAct() {
		return workAct;
	}

	public void setWorkAct(String workAct) {
		this.workAct = workAct;
	}

	@Override
	public String toString() {
		return "Work [workId=" + workId + ", workFromName=" + workFromName + ", workToName=" + workToName
				+ ", workTitle=" + workTitle + ", workTimeStart=" + workTimeStart + ", workTimeEnd=" + workTimeEnd
				+ ", workSendTime=" + workSendTime + ", workContent=" + workContent + ", workAct=" + workAct + "]";
	}

    
}