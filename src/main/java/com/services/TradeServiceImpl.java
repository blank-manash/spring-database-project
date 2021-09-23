package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TradeDAO;
import com.dataTransfer.Trade;

@Service
public class TradeServiceImpl implements TradeService {

	private final TradeDAO dao;

	@Autowired
	public TradeServiceImpl(final TradeDAO dao) {
		this.dao = dao;
	}

	@Override
	public void addTrade(final Trade trade) {
		dao.save(trade);
	}

	@Override
	public List<Trade> getTrades() {
		return dao.findAll();
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
	}

	@Override
	public List<Trade> getTradesByTicker(String ticker) {
		return dao.findByTicker(ticker);
	}

}
