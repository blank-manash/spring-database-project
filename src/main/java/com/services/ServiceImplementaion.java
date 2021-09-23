package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.SecurityDAO;
import com.dataTransfer.SecurityEntry;

@Service
public class ServiceImplementaion implements SecurityService {
	private final SecurityDAO dao;

	@Autowired
	public ServiceImplementaion(final SecurityDAO dao) {
		this.dao = dao;
	}

	@Override
	public void addSecurity(final SecurityEntry entry) {
		dao.save(entry);
	}

	@Override
	public List<SecurityEntry> getAllSecurity() {
		return dao.findAll();
	}

}
