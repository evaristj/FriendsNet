package com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface GroupDAO extends CrudRepository<Group, Long> {

//TODO
//	Group addPersons(Group group, Iterable<Person> persons);
	
}
