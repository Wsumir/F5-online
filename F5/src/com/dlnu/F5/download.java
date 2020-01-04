package com.dlnu.F5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class download
 */
@WebServlet("/download")
public class download extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public download() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("download_get");

		String path = "E:\\fileSpace\\zhangsan\\登录.png";

		response.setHeader("content-disposition", "attachment");

		File file = new File(path);
		if (!file.exists()) {
			System.out.println("文件不存在");
			return;
		}
		InputStream is = new FileInputStream(path);

		ServletOutputStream os = response.getOutputStream();

		int len = -1;
		byte[] buf = new byte[1024];

		while ((len = is.read(buf)) != -1) {
			os.write(buf, 0, len);
		}
		os.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}
