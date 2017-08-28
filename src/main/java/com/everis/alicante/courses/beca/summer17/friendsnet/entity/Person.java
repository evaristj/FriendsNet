package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name="person")
public class Person implements FNEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String surname;
	private byte[] picture;

	@OneToMany(mappedBy = "personsInEvent")
	@JsonIgnore
	private Set<Event> events = new HashSet<>();

	@OneToOne(mappedBy = "postByPerson")
	@JsonIgnore
	private Post postWritte;

	@OneToOne(mappedBy = "likesByPerson")
	@JsonIgnore
	private Like likes;

	@OneToMany(mappedBy = "personInGroup")
	@JsonIgnore
	private Set<Group> groups =new HashSet<>();

//	@ManyToMany(mappedBy = "friends")
//	@JsonIgnore
//	private Set<Person> friends = new HashSet<>();




}
