package com.services;

import java.util.List;

import com.dataTransfer.Trade;

public interface TradeService {

	public void addTrade(Trade trade);

	public List<Trade> getTrades();

	public void deleteById(int id);

	public List<Trade> getTradesByTicker(String ticker);

}
