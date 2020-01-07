package com.dlnu.F5.controller;


import java.util.HashMap;


import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlnu.F5.common.Pager;
import com.dlnu.F5.pojo.Emp;
import com.dlnu.F5.service.EmpService;

/**
 * 职员控制器
 * @author Administrator
 *
 */
@Controller
public class EmpController {
	@Autowired
	private EmpService service;
	
	
	@ResponseBody
	@RequestMapping("/emp/login")
	public int login(Emp emp,HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println("/emp/login");
		int result=service.cherkLogin(emp.getEmpLoginName(), emp.getEmpPwd());
		System.out.println(result);
		//登录成功，记录登录状态
		if(result==3){
			HttpSession session = request.getSession();
			session.setAttribute("empLoginName", emp.getEmpLoginName());	
		}
		
		return result;
	}
	
	/**
	 * 根据登录名返回员工数据
	 */
	@RequestMapping("/emp/queryByNameZsh")
	@ResponseBody
	public Emp queryByNameZsh(HttpServletRequest request, HttpServletResponse response) {

		//从session中获取用户名
		HttpSession session = request.getSession();
		String empLoginName = (String) session.getAttribute("empLoginName");
		
		return service.queryEmpByNameZsh(empLoginName);
	}
	
	/**
	 * 分页查询员工
	 */
	@RequestMapping("/emp/queryByPageZsh")
	@ResponseBody
	public HashMap<String, Object> queryByNameZsh(Integer pageNum,Integer pageSize,HttpServletRequest request, HttpServletResponse response) {

		Pager pager = new Pager(service.getEmpCountZsh(), pageSize, pageNum);		
		List<Emp> list = service.queryEmpByPageZsh(pager);
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("list", list);
		
		return map;
	}
	
	/**
	 * lyl
	 */
	
	@ResponseBody
	@RequestMapping("/emp/queryByName")
	public Emp queryByName(Emp emp, HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession();
		String empLoginName = (String) session.getAttribute("empLoginName");
		Emp e = service.TestQueryByName(empLoginName);
		return e;
	}
	
	@RequestMapping("/emp/updatePwd")
	public void updatePwd(Emp emp, HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		String empLoginName=(String) session.getAttribute("empLoginName");
		
		emp.setEmpLoginName(empLoginName);
						
		service.UpdatePwdByName(emp);
	}
	
	/**
	 * 修改员工
	 */
	@RequestMapping("/emp/update")
	public void update(Emp emp, HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		
        String empLoginName=(String) session.getAttribute("empLoginName");
		
		emp.setEmpLoginName(empLoginName);
		
		service.updateEmp(emp);
	}
	
	/**
	 * 修改用户头像
	 */
	@RequestMapping("/emp/updatePic")
	@ResponseBody
	public void updatePic(String empPic,HttpServletRequest request, HttpServletResponse response) {
		
		//从session中取出用户名
		HttpSession session = request.getSession();
		String empLoginName = (String) session.getAttribute("empLoginName");
		
		service.updateEmpPic(empLoginName, empPic);
	}
	
	
	
	/**
	 * 分页查询员工
	 */
	@RequestMapping("/emp/queryByPage")
	@ResponseBody
	public HashMap<String, Object> queryByName(Integer pageNum,Integer pageSize,HttpServletRequest request, HttpServletResponse response) {

		Pager pager = new Pager(service.getEmpCount(), pageSize, pageNum);		
		List<Emp> list = service.queryEmpByPage(pager);
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("list", list);
		
		return map;
	}
	
	/**
	 * 根据登录名返回员工头像数据
	 */
	@RequestMapping("/emp/queryHead")
	@ResponseBody
	public String queryByName(HttpServletRequest request, HttpServletResponse response) {

		// 从session中取出用户名
		HttpSession session = request.getSession();
		String empLoginName = (String) session.getAttribute("empLoginName");

		return service.TestQueryByName(empLoginName).getEmpPic();
	}
	
	/**
	 * zgz
	 */
	/**
	 * 分页查询员工
	 */
	@RequestMapping("/emp/queryByPagezgz")
	@ResponseBody
	public HashMap<String, Object> queryByNamezgz(Integer pageNum,Integer pageSize,HttpServletRequest request, HttpServletResponse response) {

		Pager pager = new Pager(service.getEmpCount(), pageSize, pageNum);		
		List<Emp> list = service.queryEmpByPagezgz(pager);
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("list", list);
		
		return map;
	}
	
	/**
	 * 根据id返回员工数据
	 */
	@RequestMapping("/emp/queryByIdzgz")
	@ResponseBody
	public List<Emp> queryByIdzgz(Integer empId, HttpServletRequest request, HttpServletResponse response) {

		return service.queryEmpByIdzgz(empId);
	}
	
	/**
	 * 根据deptid返回员工数据
	 */
	@RequestMapping("/emp/queryByDeptIdzgz")
	@ResponseBody
	public List<Emp> queryByDeptIdzgz(Integer deptId, HttpServletRequest request, HttpServletResponse response) {

		return service.queryEmpByDeptIdzgz(deptId);
	}
	
	/**
	 * 根据jobid返回员工数据
	 */
	@RequestMapping("/emp/queryByJobIdzgz")
	@ResponseBody
	public List<Emp> queryByJobIdzgz(Integer jobId, HttpServletRequest request, HttpServletResponse response) {

		return service.queryEmpByJobIdzgz(jobId);
	}
	
	
}
