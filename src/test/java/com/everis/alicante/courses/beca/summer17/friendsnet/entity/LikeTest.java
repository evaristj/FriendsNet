package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import com.everis.alicante.courses.beca.summer17.friendsnet.enums.EventType;
import com.everis.alicante.courses.beca.summer17.friendsnet.enums.LikeType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class LikeTest {

    private Like expectedLike;
    private Long expectedId = 1L;
    private Date expectedCreationDate = new Date();
    private LikeType expectedType = LikeType.SOGOOD;
    private Post expectedLikeByPost = new Post();
    private Person expectedLikeByPerson = new Person();

    @Before
    public void init(){

        this.expectedLike = new Like();
        this.expectedLike.setId(expectedId);
        this.expectedLike.setCreationDate(expectedCreationDate);
        this.expectedLike.setLikesByPerson(expectedLikeByPerson);
        this.expectedLike.setLikesByPost(expectedLikeByPost);
        this.expectedLike.setType(expectedType);


    }
    @Test
    public void getId() throws Exception {
        // Act
        final Long result = this.expectedLike.getId();
        // Assert
        Assert.assertEquals(expectedId, result);
    }

    @Test
    public void getCreationDate() throws Exception {
        // Act
        final Date result = this.expectedLike.getCreationDate();
        // Assert
        Assert.assertEquals(expectedCreationDate, result);
    }

    @Test
    public void getType() throws Exception {
        //Act
        final LikeType result = this.expectedLike.getType();
        //Assert
        Assert.assertEquals(expectedType, result);
    }

    @Test
    public void getLikesByPost() throws Exception {
        //Act
        final Post result = this.expectedLike.getLikesByPost();
        //Assert
        Assert.assertEquals(expectedLikeByPost, result);
    }

    @Test
    public void getLikesByPerson() throws Exception {
        //Act
        final Person result = this.expectedLike.getLikesByPerson();
        //Assert
        Assert.assertEquals(expectedLikeByPerson, result);
    }

    @Test
    public void setId() throws Exception {
        //Arrange
        final Like like = new Like();
        //Act
        like.setId(expectedId);
        //Assert
        Assert.assertEquals(expectedId, like.getId());
    }

    @Test
    public void setCreationDate() throws Exception {
        //Arrange
        final Like like = new Like();
        //Act
        like.setCreationDate(expectedCreationDate);
        //Assert
        Assert.assertEquals(expectedCreationDate, like.getCreationDate());
    }

    @Test
    public void setType() throws Exception {
        //Arrange
        final Like like = new Like();
        //Act
        like.setType(expectedType);
        //Assert
        Assert.assertEquals(expectedType, like.getType());
    }

    @Test
    public void setLikesByPost() throws Exception {
        //Arrange
        final Like like = new Like();
        //Act
        like.setLikesByPost(expectedLikeByPost);
        //Assert
        Assert.assertEquals(expectedLikeByPost, like.getLikesByPost());
    }

    @Test
    public void setLikesByPerson() throws Exception {
        //Arrange
        final Like like = new Like();
        //Act
        like.setLikesByPerson(expectedLikeByPerson);
        //Assert
        Assert.assertEquals(expectedLikeByPerson, like.getLikesByPerson());
    }

}