package com.dlnu.F5.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.dlnu.F5.util.Message;

@ServerEndpoint("/chat")
public class Socket {

	private static List<Session> sessions = new ArrayList<Session>();
	private static List<String> names = new ArrayList<String>();
	private String username;

	@OnOpen
	public void open(Session session) {
		String queryString = session.getQueryString();
		System.out.println(queryString);

		username = queryString.split("=")[1];
		System.out.println("切割之后的username=" + username);

		this.names.add(username);
		this.sessions.add(session);

		String msg = this.username + "进入<br/>";

		Message message = new Message();
		message.setWelcome(msg);
		message.setUsernames(this.names);

		this.broadcast(this.sessions, message.toJson());
	}

	public void broadcast(List<Session> ss, String msg) {

		for (Iterator iterator = ss.iterator(); iterator.hasNext();) {
			Session session = (Session) iterator.next();

			try {
				session.getBasicRemote().sendText(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	@OnClose
	public void close(Session session) {
		System.out.println("sessionId" + session.getId() + "关闭");
		this.sessions.remove(session);
		this.names.remove(this.username);

		String msg = this.username + "退出<br>";

		Message message = new Message();
		message.setWelcome(msg);
		message.setNames(this.names);

		this.broadcast(this.sessions, message.toJson());

	}

	@OnMessage
	public void message(Session session, String msg) {
		
		Message message = new Message();
		
		message.setContent(this.username, msg);
		
		broadcast(sessions, message.toJson());
	}

}
