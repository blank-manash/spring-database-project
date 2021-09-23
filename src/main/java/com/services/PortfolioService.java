package com.services;

import org.springframework.stereotype.Service;

import com.dataTransfer.Portfolio;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PortfolioService {
	private SecurityService secService;
	private TradeService tradeService;
	public Portfolio get() {
		return new Portfolio(secService.getAllSecurity(), tradeService.getTrades());
	}
	
}
