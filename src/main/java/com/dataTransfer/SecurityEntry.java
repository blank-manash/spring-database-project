package com.dataTransfer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SecurityEntry {
	@Id
	@GeneratedValue
	private int id;
	private String ticker;
	private int avg_price;
	private int shares;

	public SecurityEntry() {}
	
	public SecurityEntry(final String ticker, final int avg_price, final int shares) {
		this.ticker = ticker;
		this.avg_price = avg_price;
		this.shares = shares;
	}

	@Override
	public String toString() {
		return "SecurityEntry [id=" + id + ", ticker=" + ticker + ", avg_price=" + avg_price + ", shares=" + shares
				+ "]";
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the ticker
	 */
	public String getTicker() {
		return ticker;
	}

	/**
	 * @param ticker the ticker to set
	 */
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	/**
	 * @return the avg_price
	 */
	public int getAvg_price() {
		return avg_price;
	}

	/**
	 * @param avg_price the avg_price to set
	 */
	public void setAvg_price(int avg_price) {
		this.avg_price = avg_price;
	}

	/**
	 * @return the shares
	 */
	public int getShares() {
		return shares;
	}

	/**
	 * @param shares the shares to set
	 */
	public void setShares(int shares) {
		this.shares = shares;
	}
	

}
