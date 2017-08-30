package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import com.everis.alicante.courses.beca.summer17.friendsnet.enums.PostType;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class PostTest {

    private Post expectedPost;
    private Long expectedId = 1L;
    private String expectedText = "eva";
    private Date expectedCreationDate = new Date();
    private PostType expectedType = PostType.PARENTS;
    private byte[] expectedPicture = null;
    private Set<Like> expectedPostLike = new HashSet<>();
    private Person expectedPostWritter = new Person();
    private Event expectedPostInEvent = new Event();


    @Before
    public void init(){

        this.expectedPost = new Post();
        this.expectedPost.setId(expectedId);
        this.expectedPost.setCreationDate(expectedCreationDate);
        this.expectedPost.setText(expectedText);
        this.expectedPost.setType(expectedType);
        this.expectedPost.setPicture(expectedPicture);
        this.expectedPost.setLikes(expectedPostLike);
        this.expectedPost.setPostInEvent(expectedPostInEvent);
        this.expectedPost.setPostByPerson(expectedPostWritter);

    }

    @Test
    public void getId() throws Exception {
    }

    @Test
    public void getText() throws Exception {
    }

    @Test
    public void getCreationDate() throws Exception {
    }

    @Test
    public void getType() throws Exception {
    }

    @Test
    public void getPicture() throws Exception {
    }

    @Test
    public void getPostInEvent() throws Exception {
    }

    @Test
    public void getLikes() throws Exception {
    }

    @Test
    public void getPostByPerson() throws Exception {
    }

    @Test
    public void setId() throws Exception {
    }

    @Test
    public void setText() throws Exception {
    }

    @Test
    public void setCreationDate() throws Exception {
    }

    @Test
    public void setType() throws Exception {
    }

    @Test
    public void setPicture() throws Exception {
    }

    @Test
    public void setPostInEvent() throws Exception {
    }

    @Test
    public void setLikes() throws Exception {
    }

    @Test
    public void setPostByPerson() throws Exception {
    }

}