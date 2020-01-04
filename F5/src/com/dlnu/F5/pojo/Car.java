package com.dlnu.F5.pojo;

import java.sql.Date;

import org.quartz.Job;

/**
 * 员工实体类
 * 
 * @author Administrator
 *
 */
public class Car {

	private Integer carId;

	private String carName;

	private String carBoard;

	private String carState;

	private Date carStart;
	
	private Date carEnd;

	private Emp emp; // 多对一

	public Car() {
		super();
	}

	
	
	



	public Car(String carName, String carBoard, String carState, Emp emp) {
		super();
		this.carName = carName;
		this.carBoard = carBoard;
		this.carState = carState;
		this.emp = emp;
	}
	public Car(Integer carId, String carName, String carBoard, String carState, Emp emp) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carBoard = carBoard;
		this.carState = carState;
		this.carStart = carStart;
		this.carEnd = carEnd;
		this.emp = emp;
	}







	public Car(String carName, String carBoard, String carState, Emp emp, Date carStart, Date carEnd) {
		super();
		this.carName = carName;
		this.carBoard = carBoard;
		this.carState = carState;
		this.carStart = carStart;
		this.carEnd = carEnd;
		this.emp = emp;
	}

	public Car(Integer carId, String carName, String carBoard, String carState, Date carStart, Date carEnd, Emp emp) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carBoard = carBoard;
		this.carState = carState;
		this.carStart = carStart;
		this.carEnd = carEnd;
		this.emp = emp;
	}

	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarBoard() {
		return carBoard;
	}

	public void setCarBoard(String carBoard) {
		this.carBoard = carBoard;
	}

	public String getCarState() {
		return carState;
	}

	public void setCarState(String carState) {
		this.carState = carState;
	}

	public Date getCarStart() {
		return carStart;
	}

	public void setCarStart(Date carStart) {
		this.carStart = carStart;
	}

	public Date getCarEnd() {
		return carEnd;
	}

	public void setCarEnd(Date carEnd) {
		this.carEnd = carEnd;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", carBoard=" + carBoard + ", carState=" + carState
				+ ", carStart=" + carStart + ", carEnd=" + carEnd + ", emp=" + emp + "]";
	}

	
	
}