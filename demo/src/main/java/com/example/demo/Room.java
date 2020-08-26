package com.example.demo;

public class Room {
	private long roomNo;
	private String floor;
	private String bedInfo;
	
	public Room() {
		super();
	}

	public Room(long roomNo, String floor, String bedInfo) {
		super();
		this.roomNo = roomNo;
		this.floor = floor;
		this.bedInfo = bedInfo;
	}

	public long getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(long roomNo) {
		this.roomNo = roomNo;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getBedInfo() {
		return bedInfo;
	}

	public void setBedInfo(String bedInfo) {
		this.bedInfo = bedInfo;
	}
	
}
