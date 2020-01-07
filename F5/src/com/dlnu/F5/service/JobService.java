package com.dlnu.F5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dlnu.F5.dao.JobMapper;
import com.dlnu.F5.pojo.Job;

@Service
@Transactional(rollbackFor=Exception.class)
public class JobService {
	@Autowired
	private JobMapper mapper;
	
	public void addJob(Job job) {
		mapper.insert(job);		
	}
	
	public void updateJob(Job job) {
		mapper.update(job);
	}
	
	public void deleteJob(Integer jobId) {
		mapper.delete(jobId);
	}
	
	@Transactional(readOnly=true)
	public Job queryDeptById(Integer jobId) {
		
		return mapper.queryById(jobId);
	}
	
	@Transactional(readOnly=true)
	public List<Job> queryDept() {
		
		return mapper.query();
	}

}
