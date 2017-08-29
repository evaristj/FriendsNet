package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.PersonDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PersonControllerIT {


    @LocalServerPort
    private int port;

    @Autowired
    private PersonDAO dao;

    TestRestTemplate restTemplate = new TestRestTemplate();

    HttpHeaders headers = new HttpHeaders();

    private ObjectMapper mapper;

    @Before
    public void setup() {

        this.mapper = new ObjectMapper();
    }


    @Test
    public void testFindAllNoContent() throws JSONException {
        //Arrange
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);

        // Act
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/person"),
                HttpMethod.GET, null, String.class);

        // Assert
        JSONAssert.assertEquals("[]", response.getBody(), false);
    }

    @Test
    public void testFindAllWithContent() throws JSONException {
        //Arrange
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        Person person =new Person();
        person.setName("Evarist");
        person.setSurname("Jaume");
        dao.save(person);
        Person p2 = new Person();
        p2.setName("pepe");
        p2.setSurname("paca");
        dao.save(p2);

        // Act
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/person"),
                HttpMethod.GET, null, String.class);

        // Assert
        JSONAssert.assertEquals("[{'id': 1, 'name':'Evarist', 'surname':'Jaume'},{'id': 2, 'name':'pepe', 'surname':'paca'}]", response.getBody(), false);
    }

/*    @Test
    public void testFindAll() throws JSONException{
        //Act
        List<Person> all = (List<Person>)dao.findAll();

        //Assert
//        JSONAssert.assertEquals(2, all.size());

    }*/

    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
}
