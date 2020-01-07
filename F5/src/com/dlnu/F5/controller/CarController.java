package com.dlnu.F5.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlnu.F5.pojo.Car;
import com.dlnu.F5.service.CarService;
import com.dlnu.F5.pojo.Emp;
import com.dlnu.F5.common.Pager;
import com.dlnu.F5.pojo.Car;

/**
 * 部门控制器
 */
@Controller
public class CarController {
	
	@Autowired
	private CarService service;
	
	/**
	 * 增加车辆
	 */
	@RequestMapping("/car/add")
	public void add(Car car , HttpServletRequest request, HttpServletResponse response){
		
		service.addCar(car);
	}
	
	
	
	/**
	 * 删除车辆
	 */
	@RequestMapping("/car/delete")
	public void delete(Integer carId, HttpServletRequest request, HttpServletResponse response) {
		service.deleteCar(carId);
	}
	
	/**
	 * 修改车辆
	 */
	@RequestMapping("/car/update")
	public void update(Car car, HttpServletRequest request, HttpServletResponse response) {
		service.updateCar(car);
	}
	@RequestMapping("/car/update2")
	public void update2(Car car, HttpServletRequest request, HttpServletResponse response) {
		service.updateCar2(car);
	}
	
	
	/**
	 * 根据登录名返回员工数据
	 */
	@RequestMapping("/car/queryByBoard")
	@ResponseBody
	public Car queryByBoard(String carBoard, HttpServletRequest request, HttpServletResponse response) {

		return service.queryCarByBoard(carBoard);
	}
	
	/**
	 * 根据id返回车辆数据
	 */
	@RequestMapping("/car/queryById")
	@ResponseBody
	public Car queryById(Integer carId, HttpServletRequest request, HttpServletResponse response) {

		return service.queryCarById(carId);
	}
	/**
	 * 分页查询车辆
	 */
	@RequestMapping("/car/queryByPage")
	@ResponseBody
	public HashMap<String, Object> queryByName(Integer pageNum,Integer pageSize,HttpServletRequest request, HttpServletResponse response) {

		Pager pager = new Pager(service.getCarCount(), pageSize, pageNum);		
		List<Car> list = service.queryCarByPage(pager);
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("list", list);
		
		return map;
	}
    
	
	
	
}
