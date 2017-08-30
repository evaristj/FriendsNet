package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.GroupManager;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PersonManager;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class GroupControllerTest {

    @InjectMocks
    private GroupController groupController;

    @Mock
    private GroupManager groupManager;

    private MockMvc mockMvc;

    private ObjectMapper mapper;


    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(groupController).build();
        this.mapper = new ObjectMapper();
    }

    @Test
    public void testGetAllNoContent() throws Exception {
        // Arrange
        Mockito.when(groupManager.findAll()).thenReturn(null);
        // Act
        ResultActions perform = mockMvc.perform(get("/group"));
        // Assert
        perform.andExpect(status().isOk());
    }


    @Test
    public void testGetAllWithContent() throws Exception {
        // Arrange
        Person persona = new Person();
        persona.setName("pepe");
        Person personb = new Person();
        personb.setName("juan");
        List<Person> persons = new ArrayList<>();
        persons.add(persona);
        persons.add(personb);
//        Mockito.when(personManager.findAll()).thenReturn(persons);
        // Act
        ResultActions perform = mockMvc.perform(get("/person"));
        // Assert
        perform.andExpect(status().isOk());
        perform.andExpect(content().json(mapper.writeValueAsString(persons)));
    }

    @Test
    public void getAll() throws Exception {
    }

    @Test
    public void getById() throws Exception {
    }

    @Test
    public void create() throws Exception {
        //Arrenge
        Group group = new Group();
        group.setName("Anne");
        Mockito.when(groupManager.save(group)).thenReturn(group);
        //Act
        String json = mapper.writeValueAsString(group);
        ResultActions perfom = mockMvc.perform(post("/group").content(json).contentType(MediaType.APPLICATION_JSON));
        //Assert
        perfom.andExpect(status().isOk());
        perfom.andExpect(content().json(mapper.writeValueAsString(group)));
    }

    @Test
    public void getByPersonId() throws Exception {
    }

    @Test
    public void remove() throws Exception {
    }

}