package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Fruitmodel;

public interface Fruitrepo extends JpaRepository<Fruitmodel, Integer>{

}
