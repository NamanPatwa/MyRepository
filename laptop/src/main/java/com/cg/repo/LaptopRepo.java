package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Laptop;

public interface LaptopRepo extends JpaRepository<Laptop, Integer>{

}
