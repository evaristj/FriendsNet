package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import com.everis.alicante.courses.beca.summer17.friendsnet.enums.PostType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Post implements FNEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String text;

    private Date creationDate;

    private PostType type;

    private byte[] picture;

    @ManyToOne
    @JoinColumn(name = "event_id")
    @JsonIgnore
    private Event postInEvent;
}
