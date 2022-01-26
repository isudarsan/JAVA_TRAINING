package com.phrama.main.service;

import java.util.List;

import com.phrama.main.model.Pharma;

public interface PharmaService {

	
	void create(Pharma pharma);
	
	List<Pharma> getAll();
}
