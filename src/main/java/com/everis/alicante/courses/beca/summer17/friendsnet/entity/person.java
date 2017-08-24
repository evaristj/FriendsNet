package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class person implements FNEntity{
	
	private Long id;
	
	private String name;
	
	private String surname;
	
	private byte[] picture;

}
