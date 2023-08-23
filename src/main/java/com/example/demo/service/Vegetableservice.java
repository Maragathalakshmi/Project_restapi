package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Vegetablemodel;
import com.example.demo.repository.Vegetablerepo;

@Service
public class Vegetableservice {
@Autowired
Vegetablerepo vr;
public Vegetablemodel vadd (Vegetablemodel vs)
{
	return vr.save(vs);
}
public List<Vegetablemodel> vsave(List<Vegetablemodel> vs)
{
	return (List<Vegetablemodel>)vr.saveAll(vs);
}


public List<Vegetablemodel> vshow()
{
	return vr.findAll();
}

public Vegetablemodel vchange(Vegetablemodel vs)
{
	return vr.saveAndFlush(vs);
}

public void vdelete(int vid)
{
	vr.deleteById(vid);
}
}