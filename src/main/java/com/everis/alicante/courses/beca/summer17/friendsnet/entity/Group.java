package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import java.util.Set;

@Data
@Entity(name="grouptable")
public class Group implements FNEntity{
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private byte[] picture;

	//relaciones

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "group_id")
	@JsonIgnore
	private Set<Person> personInGroup;


}
