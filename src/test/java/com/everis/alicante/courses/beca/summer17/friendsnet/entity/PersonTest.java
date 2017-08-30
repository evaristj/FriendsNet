package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class PersonTest {

    private Person expectedPerson;
    private Long expectedId = 1L;
    private String expectedName = "eva";
    private String expectedSurname = "noe";
    private byte[] expectedPicture = null;
    private Set<Group> expectedGroup = new HashSet<Group>();
//    private Set<Person> expectedFriend = new HashSet<Person>();
    private Set<Event> expectedEvent = new HashSet<Event>();
//    private Set<Like> expectedLike = new HashSet<Like>();
//    private Set<Post> expectedPost = new HashSet<Post>();

    @Before
    public void init(){
        this.expectedPerson = new Person();
        this.expectedPerson.setId(expectedId);
        this.expectedPerson.setName(expectedName);
        this.expectedPerson.setSurname(expectedSurname);
        this.expectedPerson.setPicture(expectedPicture);
        this.expectedPerson.setGroups(expectedGroup);
        this.expectedPerson.setEvents(expectedEvent);
    }

    @Test
    public void testGetId() throws Exception {
        //Act
        final Long result = this.expectedPerson.getId();
        //Assert
        Assert.assertEquals(expectedId, result);
    }

    @Test
    public void testGetName() throws Exception {
        //Act
        final String result = this.expectedPerson.getName();
        //Assert
        Assert.assertEquals(expectedName, result);
    }

    @Test
    public void getSurname() throws Exception {
        //Act
        final String result = this.expectedPerson.getSurname();
        //Assert
        Assert.assertEquals(expectedSurname, result);
    }

    @Test
    public void getPicture() throws Exception {
        //Act
        final byte[] result = this.expectedPerson.getPicture();
        //Assert
        Assert.assertEquals(expectedPicture, result);
    }

    @Test
    public void getEvents() throws Exception {
        //Act
        final Set<Event> result = this.expectedPerson.getEvents();
        //Assert
        Assert.assertEquals(expectedEvent, result);
    }

    @Test
    public void getGroups() throws Exception {
        //Act
        final Set<Group> result = this.expectedPerson.getGroups();
        //Assert
        Assert.assertEquals(expectedGroup, result);
    }

    @Test
    public void setId() throws Exception {
        //Arrange
        final Person person = new Person();
        //Act
        person.setId(expectedId);
        //Assert
        Assert.assertEquals(expectedId, person.getId());
    }

    @Test
    public void setName() throws Exception {
        //Arrange
        final Person person = new Person();
        //Act
        person.setName(expectedName);
        //Assert
        Assert.assertEquals(expectedName, person.getName());
    }

    @Test
    public void setSurname() throws Exception {
        //Arrange
        final Person person = new Person();
        //Act
        person.setSurname(expectedSurname);
        //Assert
        Assert.assertEquals(expectedSurname, person.getSurname());
    }

    @Test
    public void setPicture() throws Exception {
        //Arrange
        final Person person = new Person();
        //Act
        person.setPicture(expectedPicture);
        //Assert
        Assert.assertEquals(expectedPicture, person.getPicture());
    }

    @Test
    public void setEvents() throws Exception {
        //Arrange
        final Person person = new Person();
        //Act
        person.setEvents(expectedEvent);
        //Assert
        Assert.assertEquals(expectedEvent, person.getEvents());
    }

    @Test
    public void setGroups() throws Exception {
        //Arrange
        final Person person = new Person();
        //Act
        person.setGroups(expectedGroup);
        //Assert
        Assert.assertEquals(expectedGroup, person.getGroups());
    }

}