package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Vegetablemodel;

public interface Vegetablerepo extends JpaRepository<Vegetablemodel, Integer>{

}
