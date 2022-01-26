package com.phrama.main.service;

import java.util.ArrayList;
import java.util.List;

import com.phrama.main.model.Pharma;

public class PharmaServiceImpl implements PharmaService {

	static List<Pharma> list = new ArrayList<Pharma>();
	
	
	@Override
	public void create(Pharma pharma) {
		list.add(pharma);
		
	}

	@Override
	public List<Pharma> getAll() {
		return list;
	}

}
