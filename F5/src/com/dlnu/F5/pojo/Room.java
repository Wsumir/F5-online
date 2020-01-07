package com.dlnu.F5.pojo;

public class Room {
	
	private Integer roomId;
	
	private String roomName;
	
	private Integer roomPeople;

	public Room() {
		super();
	}

	public Room(String roomName, Integer roomPeople) {
		super();
		this.roomName = roomName;
		this.roomPeople = roomPeople;
	}

	public Room(Integer roomId, String roomName, Integer roomPeople) {
		super();
		this.roomId = roomId;
		this.roomName = roomName;
		this.roomPeople = roomPeople;
	}

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public Integer getRoomPeople() {
		return roomPeople;
	}

	public void setRoomPeople(Integer roomPeople) {
		this.roomPeople = roomPeople;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomName=" + roomName + ", roomPeople=" + roomPeople + "]";
	}
	
	
	

}
