package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/room")
public class RoomController {
	
	private RoomService roomService;
	
	@Autowired
	public RoomController(RoomService roomService) {
		// TODO Auto-generated constructor stub
		this.roomService = roomService;
	}
	
	@GetMapping
	public String allRooms(Model model) {
		model.addAttribute("room",this.roomService.getAllRooms());
		return "room";
	}
}
