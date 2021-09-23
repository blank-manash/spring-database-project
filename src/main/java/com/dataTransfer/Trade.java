package com.dataTransfer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@ToString
@NoArgsConstructor
public class Trade {
	@Id
	@GeneratedValue
	private int id;
	@NotNull
	private int type;
	@Min(message = "Price Cannot Be Negetive", value = 0)
	private int price;
	@NotBlank
	private String ticker;
	@Min(message = "Minimum Stocks should be 1", value = 1)
	private int count;

	public Trade(final int type, final int price, final String ticker, final int count) {
		this.type = type;
		this.price = price;
		this.ticker = ticker;
		this.count = count;
	}
}
