package com.dataTransfer;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Portfolio {
	private List<SecurityEntry> securities;
	private List<Trade> trades;

}
