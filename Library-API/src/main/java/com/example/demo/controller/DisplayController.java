package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Menu;
import com.example.demo.service.DisplayService;

@RestController
public class DisplayController {
	@Autowired
	DisplayService	displayService;
	@RequestMapping(value = "/getDisplaydata", method = RequestMethod.GET)
	public Menu getDisplayData() {
		return displayService.getDisplayData();
	}

}
