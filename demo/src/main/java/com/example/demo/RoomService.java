package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RoomService {
private static  List<Room> room = new ArrayList<>();
	
	static {
		for(int i=0;i<10;i++) {
			room.add(new Room(i,"R"+i,"LQ"));
		}
	} 
	
	public List<Room> getAllRooms() {
		return room;
	}
}
