package com.dlnu.F5.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;



@Service
@Transactional(rollbackFor=Exception.class)
public class UploadService {


	public int upload(HttpServletRequest request)
	{
		 int result = 0;
	       if(!ServletFileUpload.isMultipartContent(request))
	       {
	           System.out.println("1");
	           throw new RuntimeException("2");

	       }
	       try{
	            System.out.println("try");
	            DiskFileItemFactory factory =new DiskFileItemFactory();
	            ServletFileUpload upload= new ServletFileUpload(factory);
	            upload.setHeaderEncoding("UTF-8");

	            System.out.println("UTF_8");
	            List<FileItem> items = upload.parseRequest(request);
	            
	            System.out.println("1");
	            for(FileItem item :items){
	            	  System.out.println("2");
	                if(item.isFormField())
	                {       
	                    String fileName = item.getFieldName();
	                    String fileValue = item.getString("UTF-8");

	                    System.out.println(fileName);
	                    System.out.println(fileValue);
	                }else
	                {      

	                    System.out.println("else");
	                	
	                    String fileName = item.getName();
	                    System.out.println(fileName);

	                    InputStream is = item.getInputStream();
//	                    String path= this.getServletContext().getRealPath("/newFile");
	                    String path = "D:\\apache-tomcat-8.0.41\\bin";
	                    System.out.println(path);
	                    File descFile = new File(path,fileName);
	                    OutputStream os = new FileOutputStream(descFile);
	                    System.out.println("is="+is);
	                    int len= -1;
	                    byte[] buf = new byte[1024];
	                    while ((len = is.read(buf))!=-1) {
	                        os.write(buf,0,len);
	                        result=1;
	                    }
	                    System.out.println("os="+os);
	                    os.close();
	                    is.close();


	                }
	            }


	        }catch (Exception e)
	        {
	            System.out.println("upload ß∞‹");
	        }
		
		return result;
		
	}
	
	
	
	
	
}
