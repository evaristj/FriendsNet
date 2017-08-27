package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import com.everis.alicante.courses.beca.summer17.friendsnet.enums.EventType;
import lombok.Data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

}
