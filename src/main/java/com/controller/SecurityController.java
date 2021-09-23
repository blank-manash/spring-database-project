package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dataTransfer.SecurityEntry;
import com.services.SecurityService;

@RestController
public class SecurityController {

	private final SecurityService service;

	@Autowired
	public SecurityController(final SecurityService service) {
		this.service = service;
	}
	
	@GetMapping("/allSecurity")
	public List<SecurityEntry> getAllSecurity() {
		return service.getAllSecurity();
	}
	
	@PostMapping("/add")
	public void addSecurity(@RequestBody final SecurityEntry entry) {
		service.addSecurity(entry);
	}

	@GetMapping("/")
	public String welcome() {
		return "This is the welcome page";
	}
}
