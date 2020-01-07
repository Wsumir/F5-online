package com.dlnu.F5.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.dlnu.F5.pojo.Emp;
import com.dlnu.F5.pojo.Userfile;
import com.dlnu.F5.service.EmpService1;
import com.dlnu.F5.service.UserfileService;

@Controller
public class UploadController {
	@Autowired
	private UserfileService service;

	@Autowired
	private EmpService1 service1;

	@RequestMapping("/upload")
	public String regist(@RequestParam MultipartFile file, HttpServletRequest request, HttpServletResponse response) {

		String loginName = (String) request.getSession().getAttribute("empLoginName");
		System.out.println(loginName);

		String userPath = "E:\\fileSpace\\" + loginName;
		File userFile = new File(userPath);

		String fileName = file.getOriginalFilename();
		String headPath;

		if (!userFile.exists() && !userFile.isDirectory()) {

			System.out.println("//不存在");

			userFile.mkdir();

		} else {
			System.out.println("//目录存在");
		}

		headPath = userPath + "\\" + fileName;

		System.out.println(headPath);
		try {

			File dest = new File(headPath);

			byte[] bytes = file.getBytes();

			// 把文件写到磁盘
			file.transferTo(dest);

			String empLoginName = (String) request.getSession().getAttribute("empLoginName");
			System.out.println(empLoginName);

			Emp emp = service1.queryByName(loginName);

			Userfile userf = new Userfile();
			userf.setEmp(emp);
			userf.setFileName(fileName);
			userf.setFilePath(headPath);
			service.insert(userf);

			return "redirect:/html/upload.html";
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:/html/upload.html";
		}
	}

	@ResponseBody
	@RequestMapping("/file/queryById")
	public List<Userfile> queryById(HttpServletRequest request, HttpServletResponse response) {

		String empLoginName = (String) request.getSession().getAttribute("empLoginName");
		System.out.println("/file/queryById");

		Emp emp = service1.queryByName(empLoginName);

		emp = service1.queryByName(empLoginName);

		System.out.println("1");
		List<Userfile> userfiles = service.queryById(emp.getEmpId());

		return userfiles;
	}

	@ResponseBody
	@RequestMapping("/file/delete")
	public void delete(Integer fileId, HttpServletRequest request, HttpServletResponse response) {

		String fileName = service.queryId(fileId);

		System.out.println(fileName);

		File file = new File(fileName);
		if (file.isFile() && file.exists()) {
			file.delete();
			System.out.println("删除单个文件" + fileName + "成功！");
		} else {
			System.out.println("删除单个文件" + fileName + "失败！");
		}

		service.delete(fileId);

	}

	@ResponseBody
	@RequestMapping("/file/download")
	public void download(Integer fileId, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String pathName = service.queryId(fileId);

		System.out.println("pathName:" + pathName);

		String[] str = pathName.split("\\\\");

		String path = "";
		for (int i = 0; i < str.length - 1; i++) {
			path += str[i] + "\\";

		}

		System.out.println("path  =" + path);

		String fileName = str[str.length - 1];
		System.out.println("fileName  =" + fileName);

		
//		 String path = "E:\\fileSpace\\zhangsan\\登录.png";
	 
//		 String fileName = "登录.jpg";
		 
		 byte[] bytes = fileName.getBytes("UTF-8");
		 fileName = new String(bytes,"ISO8859-1");
		 response.setHeader("content-disposition", "attachment;filename="+fileName);
		 
		 File file = new File(path);
	        if (!file.exists()) {
	            System.out.println("文件不存在");  
	            return;  
		}
	     InputStream is = new FileInputStream(pathName);
		 
	     ServletOutputStream os = response.getOutputStream();
	     
	     int len = -1;
	     byte[] buf = new byte[1024];
	     
	     while((len = is.read(buf))!=-1)
	     {
	    	 os.write(buf,0,len);
	     }
	     os.close();
	     
	}

}
