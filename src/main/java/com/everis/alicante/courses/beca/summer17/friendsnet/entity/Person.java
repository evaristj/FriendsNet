package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
public class Person implements FNEntity{
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String surname;
	
	private byte[] picture;


}
