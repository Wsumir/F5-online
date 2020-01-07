package com.dlnu.F5.util;

import java.util.Set;

import javax.websocket.Endpoint;
import javax.websocket.server.ServerApplicationConfig;
import javax.websocket.server.ServerEndpointConfig;

public class DemoConfig implements ServerApplicationConfig{

	//注解方式启动
	@Override
	public Set<Class<?>> getAnnotatedEndpointClasses(Set<Class<?>> scan) {
		
		System.out.println("启动"+scan.size());
		
	
		return scan;
	}
	


	//接口方式启动
	@Override
	public Set<ServerEndpointConfig> getEndpointConfigs(Set<Class<? extends Endpoint>> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
