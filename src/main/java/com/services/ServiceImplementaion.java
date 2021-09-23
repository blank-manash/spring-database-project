package com.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dao.SecurityDAO;
import com.dao.TradeDAO;
import com.dataTransfer.SecurityEntry;
import com.dataTransfer.Trade;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ServiceImplementaion implements SecurityService {
	private final SecurityDAO dao;
	private final TradeDAO trades;

	@Override
	public void addSecurity(final SecurityEntry entry) {
		dao.save(entry);
	}

	@Override
	public List<SecurityEntry> getAllSecurity() {
		final List<SecurityEntry> lst = dao.findAll();
		for (SecurityEntry entry : lst) {
			List<Trade> tr = trades.findByTicker(entry.getTicker());
			for(Trade t : tr) {
				if(t.getType() == 1) {
					double avg = entry.getAvg_price() * entry.getShares() + t.getCount() * t.getPrice();
					avg = avg / (entry.getShares() + t.getCount());
					entry.setAvg_price(avg);
					entry.setShares(entry.getShares() + t.getCount());
				} else {
					entry.setShares(entry.getShares() - t.getCount());
				}
			}
		}
		return lst;
	}

	@Override
	public double getReturns() {
		final List<SecurityEntry> lst = getAllSecurity();
		double ret = 0;
		for(SecurityEntry e : lst) {
			double cur = e.getAvg_price();
			double cnt = e.getShares();
			ret += (100 - cur) * cnt;
		}
		return ret;
	}

}
