package com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.PersonDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PersonManager;

@Service
public class PersonManagerImpl implements PersonManager{
	
	@Autowired
	private PersonDAO dao;
	

	
	

	@Override
	public Iterable<Person> findAll() {

		return dao.findAll();
	}

	@Override
	public Person findById(Long id) {

		return dao.findOne(id);
	}

	@Override
	public Person save(Person e) {

		return dao.save(e);
	}

	@Override
	public Iterable<Person> save(Iterable<Person> es) {

		return dao.save(es);
	}

	@Override
	public Person update(Person e) {

		return dao.save(e);
	}

	@Override
	public Iterable<Person> update(Iterable<Person> es) {

		return dao.save(es);
	}

	@Override
	public void remove(Person e) {

		dao.delete(e);
	}

	//metodo relate prueba
//	@Override
//	public Person relatePersons(Long id, Long idFriend) {
//
//		Person person = dao.findOne(id);
//		Person friend = dao.findOne(idFriend);
//		person.getFriend().add(friend);
//		friend.getFriend().add(person);
//		return this.dao.save(person);
//
//
//	}

}
