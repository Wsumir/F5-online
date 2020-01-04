package com.dlnu.F5.common;

import oracle.net.aso.n;

/**
 * 分页信息
 * @author Administrator
 *
 */
public class Pager {
	
	private int recordCount;//总记录数
	
	private int pageSize;//每页多少条
	
	private int pageCount;//共几页
	
	private int pageNum;//当前页码
	
	private int start;//记录起始位置
	
	private int end;//记录终止位置

	public Pager(int recordCount, int pageSize, int pageNum) {		
		this.recordCount = recordCount;
		this.pageSize = pageSize;
		this.pageNum = pageNum;
		
		//共几页
		this.pageCount = this.recordCount / this.pageSize;
			
		if (this.recordCount % this.pageSize != 0)
			this.pageCount ++;
		
		//当前页码
		if (this.pageNum < 1)
			this.pageNum = 1;
		if (this.pageNum > this.pageCount)
			this.pageNum =  this.pageCount;
		
		//计算起始终止位置
		this.start = (this.pageNum - 1) * this.pageSize; 
		this.end = this.pageNum * this.pageSize;
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "Pager [recordCount=" + recordCount + ", pageSize=" + pageSize + ", pageCount=" + pageCount
				+ ", pageNum=" + pageNum + ", start=" + start + ", end=" + end + "]";
	}

}