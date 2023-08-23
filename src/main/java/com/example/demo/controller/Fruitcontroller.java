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

import com.example.demo.model.Fruitmodel;
import com.example.demo.service.Fruitservice;


@RestController
public class Fruitcontroller {
	@Autowired
	Fruitservice fser;
	@PostMapping("addfruit")
	public Fruitmodel addf(@RequestBody Fruitmodel fs)
	{
		return fser.fadd(fs);
	}
	@PostMapping("manyfruit")
	public List<Fruitmodel> addmanyf(@RequestBody List<Fruitmodel> fs)
	{
		return fser.fsave(fs);
	}
	@GetMapping("showfruit")
	public List<Fruitmodel> showf()
	{
		return fser.fshow();
	}
	@PutMapping("updatefruit")
	public Fruitmodel modifyf(@RequestBody Fruitmodel fs)
	{
		return fser.fchange(fs);
	}
	@PutMapping("updatefruit/{fid}")
	public String modifybyid(@PathVariable int fid,@RequestBody Fruitmodel fs)
	{
		return fser.updatefinfo(fid,fs);
	}
	@DeleteMapping("deletefruit/{id}")
	public void deletefid(@PathVariable int fid )
	{
		fser.fdelete(fid);
	}
	@DeleteMapping("delfruit")
	public void delfid(@RequestParam int fid)
	{
		fser.fdelete(fid);
	}

}
