package com.dlnu.F5.pojo;

public class Userfile {
	private Integer fileId;
	
	private Emp emp;
	
	private String fileName;
	
	private String filePath;

	@Override
	public String toString() {
		return "Userfile [fileId=" + fileId + ", emp=" + emp + ", fileName=" + fileName + ", filePath=" + filePath
				+ "]";
	}

	public Userfile() {
		super();
	}

	public Userfile(Emp emp, String fileName, String filePath) {
		super();
		this.emp = emp;
		this.fileName = fileName;
		this.filePath = filePath;
	}

	public Userfile(Integer fileId, Emp emp, String fileName, String filePath) {
		super();
		this.fileId = fileId;
		this.emp = emp;
		this.fileName = fileName;
		this.filePath = filePath;
	}

	public Integer getFileId() {
		return fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	

	
	

}
