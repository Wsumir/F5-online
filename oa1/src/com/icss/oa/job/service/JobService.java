package com.icss.oa.job.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icss.oa.dept.dao.DeptMapper;
import com.icss.oa.dept.pojo.Dept;
import com.icss.oa.job.dao.JobMapper;
import com.icss.oa.job.pojo.Job;

@Service
@Transactional(rollbackFor=Exception.class)
public class JobService {
	
	@Autowired
	private JobMapper mapper;

	public void addJob(Job job){
		
		mapper.insert(job);
	}
	
	public void updateJob(Job job){
		mapper.update(job);
	}
	
	public void deleteJob(Integer jobId){
		mapper.delete(jobId);
		
	}
	
	@Transactional(readOnly=true)
	public Job queryDeptById(Integer jobId){
		return mapper.queryById(jobId);
	}
	
	@Transactional(readOnly=true)
	public List<Job> queryJob(){
		return mapper.query();
	}
	
	
	
	
	
	
	
}
