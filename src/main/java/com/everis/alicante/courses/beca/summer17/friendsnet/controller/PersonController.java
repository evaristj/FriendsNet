package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PersonManager;

@RestController
@RequestMapping("/person")
public class PersonController<Person, Long> {
	
	private PersonManager manager;
	
	@GetMapping
	public List<Person> getAll(){
		return null;
	}
	
	@PostMapping("/{id}/relate")
	public Person relate(@RequestParam Long Id, List<Long> persons) {
		return null;
	}
	


}
