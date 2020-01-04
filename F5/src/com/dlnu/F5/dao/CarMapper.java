package com.dlnu.F5.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dlnu.F5.pojo.Car;
import com.dlnu.F5.pojo.Emp;

/**
 * 员工dao
 * 
 * @author Administrator
 *
 */
public interface CarMapper {
	
	// 增加車輛
	void insert(Car car);

	// 删除車輛
	void delete(int carId);

	// 修改車輛
	void update(Car car);
	void update2(Car car);

	// 根据id查询車輛数据
	Car queryById(Integer carId);
	
	// 根据车牌查询車輛数据
	Car queryByBoard(String carBoard);

	// 获得总记录数
	int getCount();

	// 分页查询车辆
	List<Car> queryByPage(@Param("start") int start, @Param("pageSize") int pageSize);

}