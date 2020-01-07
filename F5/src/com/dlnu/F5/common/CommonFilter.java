package com.dlnu.F5.common;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 公共过滤器
 */
@WebFilter("/*")
public class CommonFilter implements Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		
		//转换请求和响应类型为子类型
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		
		//设置响应报头，允许其他域请求当前域
		response.setHeader("Access-Control-Allow-Origin", "*");
		
//		//***********登录验证拦截************
//		
//		//获得当前web应用名称
//		String context = request.getContextPath();
//				
//		//获得用户当前请求的URI
//		String uri = request.getRequestURI();
//		System.out.println(uri);
//		
//		//判断是否需要登录
//		if (!uri.equals(context + "/html/login.html")
//				&& !uri.equals(context + "/emp/login")
//				&& !uri.startsWith(context + "/js")
//				&& !uri.startsWith(context + "/css")
//				&& !uri.startsWith(context + "/images")) {
//			
//			//判断session中的用户名是否存在
//			HttpSession session = request.getSession();
//			String empLoginName = (String) session.getAttribute("empLoginName");
//			
//			//如果未登录，重定向到登陆界面
//			if (empLoginName == null) {
//				response.sendRedirect(context + "/html/login.html");
//				return;
//			}
//		}
//		
		//继续执行请求
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}