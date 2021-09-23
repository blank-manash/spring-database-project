package com.services;

import java.util.List;

import com.dataTransfer.SecurityEntry;

public interface SecurityService {

	public void addSecurity(SecurityEntry entry);

	public List<SecurityEntry> getAllSecurity();

	public double getReturns();

}
