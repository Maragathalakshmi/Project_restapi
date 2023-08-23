package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Vegetablemodel;
import com.example.demo.service.Vegetableservice;

@RestController
public class Vegetablecontroller {
	@Autowired
	Vegetableservice vser;
	@PostMapping("addveg")
	public Vegetablemodel addv(@RequestBody Vegetablemodel vs)
	{
		return vser.vadd(vs);
	}
	@PostMapping("manyveg")
	public List<Vegetablemodel> addmanyv(@RequestBody List<Vegetablemodel> vs)
	{
		return vser.vsave(vs);
	}
	@GetMapping("showveg")
	public List<Vegetablemodel> showv()
	{
		return vser.vshow();
	}
	@PutMapping("updateveg")
	public Vegetablemodel modifyv(@RequestBody Vegetablemodel vs)
	{
		return vser.vchange(vs);
	}
	@DeleteMapping("deleteveg/{id}")
	public void deletevid(@PathVariable int vid )
	{
		vser.vdelete(vid);
	}
	@DeleteMapping("delveg")
	public void delvid(@RequestParam int vid)
	{
		vser.vdelete(vid);
	}

}
