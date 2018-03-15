package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Capital;

@Repository
public interface CapitalRepository extends JpaRepository<Capital, Long> {

	Capital findByName(String name);

	

}
