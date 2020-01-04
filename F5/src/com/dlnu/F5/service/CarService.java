package com.dlnu.F5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dlnu.F5.dao.CarMapper;
import com.dlnu.F5.dao.EmpMapper;
import com.dlnu.F5.pojo.Emp;
import com.dlnu.F5.common.Pager;
import com.dlnu.F5.dao.CarMapper;
import com.dlnu.F5.pojo.Car;

@Service
@Transactional(rollbackFor=Exception.class)
public class CarService {

	@Autowired
	private CarMapper mapper;
	
	//增加新车辆
	public void addCar(Car car) {
		mapper.insert(car);
	}
	
	/**
	 * 删除员工
	 * @param emp
	 */
	public void deleteCar(Integer carId) {
		mapper.delete(carId);
	}
	
	/**
	 * 修改员工
	 */
	public void updateCar(Car car) {
		mapper.update(car);
	}
	public void updateCar2(Car car) {
		mapper.update2(car);
	}
	

	/**
	 * 根据id返回车辆数据
	 */
	public Car queryCarById(Integer carId) {
		
		return mapper.queryById(carId);
	}
	
	
	/**
	 * 根据车牌返回车辆数据
	 */
	public Car queryCarByBoard(String carBoard) {
		
		return mapper.queryByBoard(carBoard);
	}
	
	/**
	 * 获得车辆总数
	 */
	public int getCarCount() {
		
		return mapper.getCount();
	}
	
	/**
	 * 分页查询车辆
	 */
	public List<Car> queryCarByPage(Pager pager) {
		
		return mapper.queryByPage(pager.getStart(), pager.getPageSize());
	}
}