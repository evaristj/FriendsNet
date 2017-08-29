package com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.EventDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Event;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.EventManager;

@Service
public class EventManagerImpl implements EventManager{

	@Autowired
	private EventDAO dao;
	
	@Override
	public Iterable<Event> findAll() {

		return dao.findAll();
	}

	@Override
	public Event findById(Long id) {

		return dao.findOne(id);
	}

	@Override
	public Event save(Event e) {

		return dao.save(e);
	}


	public Iterable<Event> save(Iterable<Event> es) {

		return dao.save(es);
	}

	@Override
	public Event update(Event e) {

		return dao.save(e);
	}

	@Override
	public Iterable<Event> update(Iterable<Event> es) {

		return dao.save(es);
	}

	@Override
	public void remove(Event e) {
		
		dao.delete(e);
		
	}

}
