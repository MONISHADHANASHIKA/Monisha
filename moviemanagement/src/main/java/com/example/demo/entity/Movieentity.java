package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Movieentity {
@Id
	private int id;
	private String moviename;
	public Movieentity(int id, String moviename, int movieprice) {
		super();
		this.id = id;
		this.moviename = moviename;
		this.movieprice = movieprice;
	}
	private int movieprice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public int getMovieprice() {
		return movieprice;
	}
	public void setMovieprice(int movieprice) {
		this.movieprice = movieprice;
	}
	public Movieentity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
