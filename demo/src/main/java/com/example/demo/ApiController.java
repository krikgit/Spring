package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
	private RoomService roomService;
	
	public ApiController(RoomService roomService) {
		super();
		this.roomService = roomService;
	}
	@GetMapping("/room")
	public List<Room> getAll(){
		return this.roomService.getAllRooms();
	}
}
