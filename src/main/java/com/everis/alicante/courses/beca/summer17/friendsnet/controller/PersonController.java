package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PersonManager;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	PersonManager manager;
	
	@GetMapping
	public List<Person> getAll(){
		manager.findAll();
		return null;
	}
	
	@GetMapping("{id}")
	public Person getById(@RequestParam Long id) {
			return manager.findById(id);
	}
	
	@PostMapping
	public Person create(@RequestParam Person person) {
		return manager.save(person);
	}
	
	@PostMapping("/{id}/relate")
	public Person relate(@RequestParam Long id, @RequestBody List<Long> persons) {
		return null;
	}
	
	@DeleteMapping
	public void remove(@RequestParam Long id) {
		manager.remove(null);
	}
	


}
