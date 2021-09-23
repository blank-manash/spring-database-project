package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dataTransfer.Trade;
import com.services.TradeService;

@RestController
public class ServiceController {
	private final TradeService service;

	@Autowired
	public ServiceController(final TradeService service) {
		this.service = service;
	}

	@PostMapping("/trade")
	public void addTrade(@RequestBody final Trade trade) {
		service.addTrade(trade);
	}

	@PutMapping("/trade")
	public void updateTrade(@RequestBody final Trade trade) {
		service.addTrade(trade);
	}

	@GetMapping("/trade")
	public List<Trade> getTrades() {
		return service.getTrades();
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/trade/{id}")
	public void delete(@PathVariable int id) {
		service.deleteById(id);
	}
	
	@GetMapping("/trade/{ticker}")
	public List<Trade> getTradesByTicker(@PathVariable String ticker) {
		return service.getTradesByTicker(ticker);
	}
}
