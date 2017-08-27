package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.GroupManager;

@RestController
@RequestMapping("/group")
@Transactional
public class GroupController {
	
	
	
	@Autowired
	private GroupManager manager;
	
	@GetMapping
	public List<Group> getAll(){
		return (List<Group>) manager.findAll();
	}
	
	@GetMapping("/{id}")
	public Group getById(@RequestParam Long id) {

		return manager.findById(id);
	}
	
	@PostMapping
	public Group create(@RequestBody Group group) {

		return manager.save(group);
	}
	
	@GetMapping("/person{id}")
	public Group getByPersonId(@RequestParam Long id) {

		return null;
	}
	
	@PostMapping("/{id}relate")
	public Person relate(@RequestParam Long person, @RequestBody List<Person> persons) {

		return null;
	}
	
	@DeleteMapping
	public void remove(@RequestParam Long id) {

		manager.remove(manager.findById(id));
	}

}
