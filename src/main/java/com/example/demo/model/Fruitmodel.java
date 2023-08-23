package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="FRUITS")
public class Fruitmodel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id")
	private int fid;
	
	@Column(name="Fruit name")
	private String fname;
	@Column(name="price")
	private long fprice;
	public int getFId() {
		return fid;
	}
	public void setId(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public long getFprice() {
		return fprice;
	}
	public void setFprice(long fprice) {
		this.fprice = fprice;
	}
	public Fruitmodel(int fid, String fname, long fprice)
	{
		super();
		this.fid = fid;
		this.fname = fname;
		this.fprice = fprice;
	}
	public Fruitmodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
