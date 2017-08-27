package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import com.everis.alicante.courses.beca.summer17.friendsnet.enums.PostType;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
}
