package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Fruitmodel;
import com.example.demo.repository.Fruitrepo;

@Service
public class Fruitservice {
@Autowired
Fruitrepo fr;

public Fruitmodel fadd (Fruitmodel fs)
{
	return fr.save(fs);
}
public List<Fruitmodel> fsave(List<Fruitmodel> fs)
{
	return (List<Fruitmodel>)fr.saveAll(fs);
}
public List<Fruitmodel> fshow()
{
	return fr.findAll();
}
public Fruitmodel fchange(Fruitmodel fs)
{
	return fr.saveAndFlush(fs);
}
public String updatefinfo(int fid,Fruitmodel fs)
{
	fr.saveAndFlush(fs);
	
	if(fr.existsById(fid))
	{
		return "Updated successfully";
	}
	else
	{
		return "Invalid id";
	}
}
public void fdelete(int fid)
{
	fr.deleteById(fid);
}
}
