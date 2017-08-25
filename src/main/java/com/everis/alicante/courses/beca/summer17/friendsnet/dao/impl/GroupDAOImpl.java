package com.everis.alicante.courses.beca.summer17.friendsnet.dao.impl;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.AbstractDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.GroupDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;

public class GroupDAOImpl extends AbstractDAO<Group, Long> implements GroupDAO{

	@Override
	public Group addPersons(Group group, Iterable<Person> persons) {
		// TODO Auto-generated method stub
		return null;
	}

}
