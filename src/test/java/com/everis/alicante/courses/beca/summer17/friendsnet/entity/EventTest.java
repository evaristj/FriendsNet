package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import com.everis.alicante.courses.beca.summer17.friendsnet.enums.EventType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class EventTest {

    private Event expectedEvent;
    private Long expectedId = 1L;
    private String expectedName = "eva";
    private byte[] expectedPicture = null;
    private Set<Person> expectedPersonInEvent = new HashSet<>();
    private  EventType expectedType = EventType.GAMES;
    private Date expectedStartingDate = new Date();
    private Date expectedEndingDate = new Date();
    private Set<Post> expectedPost = new HashSet<>();

    @Before
    public void init(){

        this.expectedEvent = new Event();
        this.expectedEvent.setType(expectedType);
        this.expectedEvent.setName(expectedName);
        this.expectedEvent.setId(expectedId);
        this.expectedEvent.setPicture(expectedPicture);
        this.expectedEvent.setPersonsInEvent(expectedPersonInEvent);
        this.expectedEvent.setStartingDate(expectedStartingDate);
        this.expectedEvent.setEndingDate(expectedEndingDate);
        this.expectedEvent.setPosts(expectedPost);


    }


    @Test
    public void getId() throws Exception {
        //Act
        final Long result = this.expectedEvent.getId();
        //Assert
        Assert.assertEquals(expectedId, result);
    }

    @Test
    public void getName() throws Exception {
        //Act
        final String result = this.expectedEvent.getName();
        //Assert
        Assert.assertEquals(expectedName, result);
    }

    @Test
    public void getStartingDate() throws Exception {
        //Act
        final Date result = this.expectedEvent.getStartingDate();
        //Assert
        Assert.assertEquals(expectedStartingDate, result);
    }

    @Test
    public void getEndingDate() throws Exception {
        //Act
        final Date result = this.expectedEvent.getEndingDate();
        //Assert
        Assert.assertEquals(expectedEndingDate, result);
    }

    @Test
    public void getType() throws Exception {
        //Act
        final EventType result = this.expectedEvent.getType();
        //Assert
        Assert.assertEquals(expectedType, result);
    }

    @Test
    public void getPicture() throws Exception {
        //Act
        final byte[] result = this.expectedEvent.getPicture();
        //Assert
        Assert.assertEquals(expectedPicture, result);
    }

    @Test
    public void getPersonsInEvent() throws Exception {
        //Act
        final Set<Person> result = this.expectedEvent.getPersonsInEvent();
        //Assert
        Assert.assertEquals(expectedPersonInEvent, result);
    }

    @Test
    public void getPosts() throws Exception {
        //Act
        final Set<Post> result = this.expectedEvent.getPosts();
        //Assert
        Assert.assertEquals(expectedPost, result);
    }

    @Test
    public void setId() throws Exception {
        //Arrange
        final Event event = new Event();
        //Act
        event.setId(expectedId);
        //Assert
        Assert.assertEquals(expectedId, event.getId());
    }

    @Test
    public void setName() throws Exception {
        //Arrange
        final Event event = new Event();
        //Act
        event.setName(expectedName);
        //Assert
        Assert.assertEquals(expectedName, event.getName());
    }

    @Test
    public void setStartingDate() throws Exception {
        //Arrange
        final Event event = new Event();
        //Act
        event.setStartingDate(expectedStartingDate);
        //Assert
        Assert.assertEquals(expectedStartingDate, event.getStartingDate());
    }

    @Test
    public void setEndingDate() throws Exception {
        // Arrange
        final Event event = new Event();
        // Act
        event.setStartingDate(expectedStartingDate);
        // Assert
        Assert.assertEquals(expectedStartingDate, event.getStartingDate());
    }

    @Test
    public void setType() throws Exception {
        // Arrange
        final Event event = new Event();
        // Act
        event.setType(expectedType);
        // Assert
        Assert.assertEquals(expectedType, event.getType());
    }

    @Test
    public void setPicture() throws Exception {
        // Arrange
        final Event event = new Event();
        // Act
        event.setPicture(expectedPicture);
        // Assert
        Assert.assertEquals(expectedPicture, event.getPicture());
    }

    @Test
    public void setPersonsInEvent() throws Exception {
        // Arrange
        final Event event = new Event();
        // Act
        event.setPersonsInEvent(expectedPersonInEvent);
        // Assert
        Assert.assertEquals(expectedPersonInEvent, event.getPersonsInEvent());
    }

    @Test
    public void setPosts() throws Exception {
        // Arrange
        final Event event = new Event();
        // Act
        event.setPosts(expectedPost);
        // Assert
        Assert.assertEquals(expectedPost, event.getPosts());
    }

}