package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.ScheduledEvent;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.EventManager;

@RestController
@RequestMapping("/event")
@Transactional
public class EventController {
	
	@Autowired
	private EventManager manager;
	
	@GetMapping
	public List<ScheduledEvent> getAll(){
		return (List<ScheduledEvent>) manager.findAll();
	}
	
	@GetMapping("/{id}")
	public ScheduledEvent getById(@PathVariable Long id) {
		return manager.findById(id);
	}
	
//	@GetMapping
//	public Event addPerson(@PathVariable Long person, @PathVariable Long id) {
//		return manager.save(e);
//	}
	
	@PostMapping("/person{id}")
	public List<ScheduledEvent> getByPersonId(@PathVariable ScheduledEvent id){
		return null;
		
	}
	
	@PostMapping
	public ScheduledEvent create(@RequestBody ScheduledEvent event) {
		return manager.save(event);
	}
	
	@DeleteMapping
	public void remove(@RequestParam ScheduledEvent event) {
		manager.remove(event);
	}

}
