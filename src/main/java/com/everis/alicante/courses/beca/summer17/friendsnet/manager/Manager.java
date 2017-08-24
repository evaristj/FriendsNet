package com.everis.alicante.courses.beca.summer17.friendsnet.manager;

public interface Manager<E, ID> {
	
	Iterable<E> findAll();
	
	E findById(ID id);
	
	E save(E e);
	
	void save(Iterable<E> es);
	
	E update(E e);
	
	void update(Iterable<E> es);
	
	void remove(E e);
	

}
