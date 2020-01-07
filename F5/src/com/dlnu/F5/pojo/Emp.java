package com.dlnu.F5.pojo;

import java.sql.Date;

/**
 * 员工实体类
 * 
 * @author Administrator
 *
 */
public class Emp {

	private Integer empId;

	private String empName;

	private String empLoginName;

	private String empPwd;

	private String empEmail;

	private String empPhone;

	private Date empHiredate;

	private Integer empSalary;

	private Dept dept; // 多对一

	private Job job; // 多对一

	private String empPic;

	private String empInfo;

	public Emp() {
		super();
	}

	public Emp(String empName, String empLoginName, String empPwd, String empEmail, String empPhone, Date empHiredate,
			Integer empSalary, Dept dept, Job job, String empPic, String empInfo) {
		super();
		this.empName = empName;
		this.empLoginName = empLoginName;
		this.empPwd = empPwd;
		this.empEmail = empEmail;
		this.empPhone = empPhone;
		this.empHiredate = empHiredate;
		this.empSalary = empSalary;
		this.dept = dept;
		this.job = job;
		this.empPic = empPic;
		this.empInfo = empInfo;
	}

	public Emp(Integer empId, String empName, String empLoginName, String empPwd, String empEmail, String empPhone,
			Date empHiredate, Integer empSalary, Dept dept, Job job, String empPic, String empInfo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empLoginName = empLoginName;
		this.empPwd = empPwd;
		this.empEmail = empEmail;
		this.empPhone = empPhone;
		this.empHiredate = empHiredate;
		this.empSalary = empSalary;
		this.dept = dept;
		this.job = job;
		this.empPic = empPic;
		this.empInfo = empInfo;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpLoginName() {
		return empLoginName;
	}

	public void setEmpLoginName(String empLoginName) {
		this.empLoginName = empLoginName;
	}

	public String getEmpPwd() {
		return empPwd;
	}

	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public Date getEmpHiredate() {
		return empHiredate;
	}

	public void setEmpHiredate(Date empHiredate) {
		this.empHiredate = empHiredate;
	}

	public Integer getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Integer empSalary) {
		this.empSalary = empSalary;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public String getEmpPic() {
		return empPic;
	}

	public void setEmpPic(String empPic) {
		this.empPic = empPic;
	}

	public String getEmpInfo() {
		return empInfo;
	}

	public void setEmpInfo(String empInfo) {
		this.empInfo = empInfo;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empLoginName=" + empLoginName + ", empPwd=" + empPwd
				+ ", empEmail=" + empEmail + ", empPhone=" + empPhone + ", empHiredate=" + empHiredate + ", empSalary="
				+ empSalary + ", dept=" + dept + ", job=" + job + ", empPic=" + empPic + ", empInfo=" + empInfo + "]";
	}

}