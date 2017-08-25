package com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.GroupDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.GroupManager;

@Service
public class GroupManagerImpl implements GroupManager{
	
	@Autowired
	private GroupDAO dao;

	@Override
	public Iterable<Group> findAll() {

		return dao.findAll();
	}

	@Override
	public Group findById(Long id) {

		return dao.findById(id);
	}

	@Override
	public Group save(Group e) {

		return dao.save(e);
	}

	@Override
	public Iterable<Group> save(Iterable<Group> es) {

		return dao.save(es);
	}

	@Override
	public Group update(Group e) {

		return dao.update(e);
	}

	@Override
	public Iterable<Group> update(Iterable<Group> es) {

		return dao.update(es);
	}

	@Override
	public void remove(Group e) {
		
		dao.remove(e);
		
	}

	@Override
	public Group addPersons(Group group, Iterable<Person> persons) {

		return dao.addPersons(group, persons);
	}
	
	

}
