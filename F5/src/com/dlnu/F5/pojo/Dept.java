package com.dlnu.F5.pojo;

/**
 * 部门实体类
 * @author Administrator
 *
 */
public class Dept {
	
	private Integer deptId;
	
	private String deptName;
	
	private String deptLoc;
	
//	private List<Emp> emp;//一对多

	public Dept() {
		super();
	}
	
	public Dept(String deptName, String deptLoc) {
		super();
		this.deptName = deptName;
		this.deptLoc = deptLoc;
	}

	public Dept(Integer deptId, String deptName, String deptLoc) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptLoc() {
		return deptLoc;
	}

	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}

	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", deptName=" + deptName + ", deptLoc=" + deptLoc + "]";
	}
	
}