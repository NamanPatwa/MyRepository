package com.cg.service;

import java.util.List;

import com.cg.entity.Laptop;

public interface LaptopService {

		Laptop save(Laptop laptop);
		
		Laptop fetch(int id);
		
		List<Laptop> fetchAll();
		
		Laptop update(Laptop laptop);
		
		Boolean delete(int id);
}
