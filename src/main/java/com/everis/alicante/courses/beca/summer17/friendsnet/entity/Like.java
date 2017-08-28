package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import com.everis.alicante.courses.beca.summer17.friendsnet.enums.LikeType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name="liketable")
public class Like implements FNEntity {

    @Id
    @GeneratedValue
    private Long id;

    private Date creationDate;

    private LikeType type;

    //relaciones

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "post_id")
    private Post likesByPost;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name ="likesByPerson")
    @JsonIgnore
    private Person likesByPerson;


}
