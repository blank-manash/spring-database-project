package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dataTransfer.SecurityEntry;

@Repository
public interface SecurityDAO extends JpaRepository<SecurityEntry, Integer> {

}
