package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Movieentity;
import com.example.demo.repository.Movierepository;

@RestController
public class Moviecontroller {
	
	@Autowired
	public Movierepository mrepo;
	
	@PostMapping("/addmovie")
	public Movieentity addmovie(@RequestBody Movieentity mov) {
		try {
			mrepo.save(mov);
			return mov;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
		
	}		
		@PutMapping("/updatemovie")
		public Movieentity updatemovie(@RequestBody Movieentity mov) {
			try {
				mrepo.save(mov);
				return mov;
			}catch(Exception e){
				e.printStackTrace();
			}
			return null;
		}
			
			@GetMapping("/getmovie")
			public List<Movieentity> getmovie(){
				try {
					return mrepo.findAll();
				}catch(Exception e){
					e.printStackTrace();
				}
				return null;
	}
			@DeleteMapping("/deletemovie/{Id}")
			public String deletemovie(@PathVariable int Id){
				try {
					Movieentity mov=mrepo.getOne(Id);
					mrepo.delete(mov);
					return "movie deleted";
					 
				}catch(Exception e){
					e.printStackTrace();
				}
				return null;
	}
}




