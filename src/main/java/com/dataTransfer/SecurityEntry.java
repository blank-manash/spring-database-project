package com.dataTransfer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class SecurityEntry {
	@Id
	@GeneratedValue
	private int id;
	private String ticker;
	private double avg_price;
	private int shares;

	public SecurityEntry() {
	}

	public SecurityEntry(final String ticker, final double avg_price, final int shares) {
		this.ticker = ticker;
		this.avg_price = avg_price;
		this.shares = shares;
	}

}
