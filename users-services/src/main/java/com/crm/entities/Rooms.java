package com.crm.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "rooms")
public class Rooms {
	@Id
	private String id;
	@Field("name")
	private String roomName;
	@Field("roomsize")
	private String roomSize;
	@Field("roomdetails")
	private String roomDetails;
	public Rooms(String roomName, String roomSize, String roomDetails) {
		super();
		this.roomName = roomName;
		this.roomSize = roomSize;
		this.roomDetails = roomDetails;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomSize() {
		return roomSize;
	}
	public void setRoomSize(String roomSize) {
		this.roomSize = roomSize;
	}
	public String getRoomDetails() {
		return roomDetails;
	}
	public void setRoomDetails(String roomDetails) {
		this.roomDetails = roomDetails;
	}
	@Override
	public String toString() {
		return "Rooms [id=" + id + ", roomName=" + roomName + ", roomSize=" + roomSize + ", roomDetails=" + roomDetails
				+ "]";
	}
	
}
