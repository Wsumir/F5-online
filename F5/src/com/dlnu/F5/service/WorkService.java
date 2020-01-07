package com.dlnu.F5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dlnu.F5.common.Pager;
import com.dlnu.F5.dao.WorkMapper;
import com.dlnu.F5.pojo.Work;

/**
 * 工作流业务
 * @author Administrator
 *
 */
@Service
public class WorkService {

	@Autowired
	private WorkMapper mapper;
	
	public void addWork(Work work){
		mapper.insert(work);
	}
	
	public void updataWork(Work work){
		mapper.update(work);
	}
	
	public void deleteWork(Integer workId){
		mapper.delete(workId);
	}
	
	/**
	 *根据接收人查询工作
	 */
	@Transactional(readOnly=true)
	public List<Work> queryWorkByToName(String workToName){
		return mapper.queryByToName(workToName);
	}
	
	/**
	 * 根据发送人查询工作
	 */
	@Transactional(readOnly=true)
	public List<Work> queryWorkByFromName(String workFromName){
		return mapper.queryByFromName(workFromName);
	}
	
	/**
	 * 根据工作id查询工作
	 */
	@Transactional(readOnly=true)
	public Work queryWorkById(Integer workId){
		return mapper.queryById(workId);
	}
	
	/**
	 * 查询所有工作细信息
	 */
	@Transactional(readOnly=true)
	public List<Work> query() {		 
		return mapper.query();
	}
	
	
	/**
	 * 获得工作总数
	 */
	public int getWorkCount() {
		
		return mapper.getCount();
	}
	
	
	/**
	 * 分页查询工作
	 */
	public List<Work> queryWorkByPage(Pager pager) {
		
		return mapper.queryByPage(pager.getStart(), pager.getPageSize());
	}
	
}
