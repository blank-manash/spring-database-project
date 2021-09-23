package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dataTransfer.Trade;

@Repository
public interface TradeDAO extends JpaRepository<Trade, Integer> {
	List<Trade> findByTicker(String ticker);
}
