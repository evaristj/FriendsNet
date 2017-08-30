package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GroupTest {

    private Group expectedGroup;
    private Long expectedId = 1L;
    private String expectedName = "eva";
    private byte[] expectedPicture = null;
    private  Set<Person> expectedPersonInGroup = new HashSet<>();

    @Before
    public void init(){

        this.expectedGroup = new Group();
        this.expectedGroup.setName(expectedName);
        this.expectedGroup.setId(expectedId);
        this.expectedGroup.setPicture(expectedPicture);
        this.expectedGroup.setPersonInGroup(expectedPersonInGroup);

    }

    @Test
    public void testGetPicture() {
        // Act
        final byte[] result = this.expectedGroup.getPicture();
        // Assert
        Assert.assertEquals(expectedPicture, result);
    }

    @Test
    public void testSetPicture() {
        // Arrange
        final Group group = new Group();
        // Act
        group.setPicture(expectedPicture);
        // Assert
        Assert.assertEquals(expectedPicture, group.getPicture());
    }

    @Test
    public void getId() throws Exception {
        //Act
        final Long result = this.expectedGroup.getId();
        //Assert
        Assert.assertEquals(expectedId, result);
    }

    @Test
    public void getName() throws Exception {
        //Act
        final String result = this.expectedGroup.getName();
        //Assert
        Assert.assertEquals(expectedName, result);
    }

    @Test
    public void getPicture() throws Exception {
        //Act
        final byte[] result = this.expectedGroup.getPicture();
        //Assert
        Assert.assertEquals(expectedPicture, result);
    }

    @Test
    public void setId() throws Exception {
        //Arrange
        final Group group = new Group();
        //Act
        group.setId(expectedId);
        //Assert
        Assert.assertEquals(expectedId, group.getId());
    }

    @Test
    public void setName() throws Exception {
        //Arrange
        final Group group = new Group();
        //Act
        group.setName(expectedName);
        //Assert
        Assert.assertEquals(expectedName, group.getName());
    }

    @Test
    public void setPicture() throws Exception {
        //Arrange
        final Group group = new Group();
        //Act
        group.setPicture(expectedPicture);
        //Assert
        Assert.assertEquals(expectedPicture, group.getPicture());

    }

}