package com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.EventDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.ScheduledEvent;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.EventManager;

@Service
public class EventManagerImpl implements EventManager{
	
	@Autowired
	private EventDAO dao;
	
	@Override
	public Iterable<ScheduledEvent> findAll() {

		return dao.findAll();
	}

	@Override
	public ScheduledEvent findById(Long id) {

		return dao.findById(id);
	}

	@Override
	public ScheduledEvent save(ScheduledEvent e) {

		return dao.save(e);
	}

	@Override
	public Iterable<ScheduledEvent> save(Iterable<ScheduledEvent> es) {

		return dao.save(es);
	}

	@Override
	public ScheduledEvent update(ScheduledEvent e) {

		return dao.update(e);
	}

	@Override
	public Iterable<ScheduledEvent> update(Iterable<ScheduledEvent> es) {

		return dao.update(es);
	}

	@Override
	public void remove(ScheduledEvent e) {
		
		dao.remove(e);
		
	}

}
