package com.dlnu.F5.dao;

import java.util.List;

import org.junit.Test;

import com.dlnu.F5.pojo.Dept;
import com.dlnu.F5.pojo.Job;

public interface JobMapper {
 
	void insert(Job job);

	void update(Job job);
	
	void delete(Integer jobId);
	
	Job queryById(Integer jobId);
	
	List<Job> query();

}
