package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dataTransfer.Portfolio;
import com.services.PortfolioService;

@RestController
public class PortfolioContorller {
	@Autowired
	private PortfolioService service;
	@GetMapping("/portfolio")
	public Portfolio getPortfolio() {
		return service.get();
	}
}
