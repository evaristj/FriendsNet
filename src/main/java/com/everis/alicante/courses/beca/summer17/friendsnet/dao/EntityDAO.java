package com.everis.alicante.courses.beca.summer17.friendsnet.dao;

public interface EntityDAO<E, ID> {
	
	Iterable<E> findAll();
	
	E findById(ID id);
	
	E save(E e);
	
	Iterable<E> save(Iterable<E> es);
	
	E update(E e);
	
	Iterable<E> update(Iterable<E> es);
	
	void remove(E e);

}
