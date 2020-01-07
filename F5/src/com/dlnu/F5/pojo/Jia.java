package com.dlnu.F5.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Jia {
	
    private Integer jiaId;
	
	private Emp emp;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date jiaTime;
	
	private String jiaInfo;

	public Jia() {
		super();
	}

	public Jia(Emp emp, Date jiaTime, String jiaInfo) {
		super();
		this.emp = emp;
		this.jiaTime = jiaTime;
		this.jiaInfo = jiaInfo;
	}

	public Jia(Integer jiaId, Emp emp, Date jiaTime, String jiaInfo) {
		super();
		this.jiaId = jiaId;
		this.emp = emp;
		this.jiaTime = jiaTime;
		this.jiaInfo = jiaInfo;
	}

	public Integer getJiaId() {
		return jiaId;
	}

	public void setJiaId(Integer jiaId) {
		this.jiaId = jiaId;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public Date getJiaTime() {
		return jiaTime;
	}

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	public void setJiaTime(Date jiaTime) {
		this.jiaTime = jiaTime;
	}

	public String getJiaInfo() {
		return jiaInfo;
	}

	public void setJiaInfo(String jiaInfo) {
		this.jiaInfo = jiaInfo;
	}

	@Override
	public String toString() {
		return "Jia [jiaId=" + jiaId + ", emp=" + emp + ", jiaTime=" + jiaTime + ", jiaInfo=" + jiaInfo + "]";
	}
	
	

}
