package com.cg.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Laptop;
import com.cg.service.LaptopService;

@RestController
@RequestMapping("/laptops")
public class laptopController {

	@Autowired
	private LaptopService service;
	
	@PostMapping(value = "/save", consumes = "application/json", produces = "application/json")
	public Laptop saveLaptop(@RequestBody Laptop laptop) {
		return service.save(laptop);
	}
	
	@GetMapping(value = "/{idd}", produces = "application/json")
	public Laptop getLaptop(@PathVariable int idd) {
		return service.fetch(idd);
	}
	
	@GetMapping(produces = "application/json")
	public List<Laptop> getAllLaptop(){
		return service.fetchAll();
	}
	
	@PutMapping(value = "/update", consumes = "application/json", produces = "application/json")
	public Laptop updateLaptop(@RequestBody Laptop laptop) {
		return service.update(laptop);
	}
	
	@DeleteMapping(value = "/remove")
	public boolean deleteLaptop(@RequestParam("id") int id) {
		return service.delete(id);
	} 
	
}
