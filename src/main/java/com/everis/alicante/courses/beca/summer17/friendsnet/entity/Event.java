package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import com.everis.alicante.courses.beca.summer17.friendsnet.enums.EventType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Data
@Entity(name="TableEvent")
public class Event implements FNEntity{
	
	@Id
	@GeneratedValue
	@Column(name="event_id")
	private Long id;
	private String name;
	private Date startingDate;
	private Date endingDate;
	private EventType type;
	private byte[] picture;

	//relaciones

	@OneToMany
	@JsonIgnore
	@JoinColumn(name ="person_id")
	private Set<Person> personsInEvent = new HashSet<>();

	@OneToMany(mappedBy = "postInEvent", fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<Post> posts = new HashSet<>();

}
