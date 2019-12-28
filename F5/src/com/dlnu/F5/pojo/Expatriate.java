package com.dlnu.F5.pojo;

import java.sql.Date;

public class Expatriate {
	
	private Integer expatriateId;
	
	private Emp emp; // ∂‡∂‘“ª
	
	private String expatriateCompany;
	
	private Date expatriateDate;
	
	private Integer expatriateDays;

	
	
	public Expatriate() {
		super();
	}


	public Expatriate(Emp emp, String expatriateCompany, Date expatriateDate, Integer expatriateDays) {
		super();
		this.emp = emp;
		this.expatriateCompany = expatriateCompany;
		this.expatriateDate = expatriateDate;
		this.expatriateDays = expatriateDays;
	}

	public Expatriate(Integer expatriateId, Emp emp, String expatriateCompany, Date expatriateDate,
			Integer expatriateDays) {
		super();
		this.expatriateId = expatriateId;
		this.emp = emp;
		this.expatriateCompany = expatriateCompany;
		this.expatriateDate = expatriateDate;
		this.expatriateDays = expatriateDays;
	}



	@Override
	public String toString() {
		return "Expatriate [expatriateId=" + expatriateId + ", emp=" + emp + ", expatriateCompany=" + expatriateCompany
				+ ", expatriateDate=" + expatriateDate + ", expatriateDays=" + expatriateDays + "]";
	}


	public Integer getExpatriateId() {
		return expatriateId;
	}



	public void setExpatriateId(Integer expatriateId) {
		this.expatriateId = expatriateId;
	}



	public Emp getEmp() {
		return emp;
	}



	public void setEmp(Emp emp) {
		this.emp = emp;
	}



	public String getExpatriateCompany() {
		return expatriateCompany;
	}



	public void setExpatriateCompany(String expatriateCompany) {
		this.expatriateCompany = expatriateCompany;
	}



	public Date getExpatriateDate() {
		return expatriateDate;
	}



	public void setExpatriateDate(Date expatriateDate) {
		this.expatriateDate = expatriateDate;
	}



	public Integer getExpatriateDays() {
		return expatriateDays;
	}



	public void setExpatriateDays(Integer expatriateDays) {
		this.expatriateDays = expatriateDays;
	}
	
	

	

}
