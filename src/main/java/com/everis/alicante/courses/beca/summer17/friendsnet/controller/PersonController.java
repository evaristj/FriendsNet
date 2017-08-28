package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PersonManager;

@RestController
@RequestMapping("/person")
@Transactional
public class PersonController {
	
	@Autowired
	private PersonManager manager;
	
	@GetMapping
	public List<Person> getAll(){
		
		return (List<Person>) manager.findAll();
	}
	
	@GetMapping("/{id}")
	public Person getById(@PathVariable Long id) {
			return manager.findById(id);
	}
	
	@PostMapping
	public Person create(@RequestBody Person person) {
		return manager.save(person);
	}
	
	@PostMapping("/{id}/relate")
	public Person relate(@PathVariable Long id, @RequestBody List<Long> persons) {

		//falta completar
		return null;
	}
	
	@DeleteMapping
	public void remove(@RequestParam Long id) {
		manager.remove(manager.findById(id));
	}
	


}
