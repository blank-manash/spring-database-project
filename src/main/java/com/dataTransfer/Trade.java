package com.dataTransfer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Trade {
	@Id
	@GeneratedValue
	private int id;
	private int type;
	private int price;
	private String ticker;
	private int count;

	public Trade(final int type, final int price, final String ticker, final int count) {
		this.type = type;
		this.price = price;
		this.ticker = ticker;
		this.count = count;
	}

	public Trade() {
	}

	@Override
	public String toString() {
		return "Trade [id=" + id + ", type=" + type + ", price=" + price + ", ticker=" + ticker + ", count=" + count
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
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @return the ticker
	 */
	public String getTicker() {
		return ticker;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

}
