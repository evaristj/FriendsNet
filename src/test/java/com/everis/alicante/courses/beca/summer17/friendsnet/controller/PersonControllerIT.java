package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.PersonDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.ExpectedDatabase;
import com.github.springtestdbunit.assertion.DatabaseAssertionMode;
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
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.test.context.TestExecutionListeners;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        DbUnitTestExecutionListener.class})
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


//    @Test
//    public void testFindAllNoContent() throws JSONException {
//        //Arrange
//        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
//
//        // Act
//        ResponseEntity<String> response = restTemplate.exchange(
//                createURLWithPort("/person"),
//                HttpMethod.GET, null, String.class);
//
//        // Assert
//        JSONAssert.assertEquals("[]", response.getBody(), false);
//    }

    @Test
    @DatabaseSetup("/db/initial-person.xml")
    public void testFindAllWithContent() throws JSONException {
        //Arrange
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);

        // Act
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/person"),
                HttpMethod.GET, null, String.class);

        // Assert
        JSONAssert.assertEquals("[{'id': 1, 'name':'Evarist', 'surname':'Jaume'}," +
                "{'id': 2, 'name':'Pepe', 'surname':'Pepito'},{'id': 3, 'name':'Paca', 'surname':'Perez'}," +
                "{'id': 4, 'name':'Lola', 'surname':'peluquera'}]", response.getBody(), false);
    }

    @Test
    @DatabaseSetup("/db/initial-person.xml")
    @ExpectedDatabase(value = "/db/initial-person.xml", assertionMode = DatabaseAssertionMode.NON_STRICT_UNORDERED)
    public void testFindOne() throws JSONException {
        // Act
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/person/1"),
                HttpMethod.GET, null, String.class);

        // Assert
        JSONAssert.assertEquals("{'id'=1, 'name'='Evarist', 'surname'= 'Jaume'}", response.getBody(), false);
    }

    @Test
    @DatabaseSetup("/db/initial-person.xml")
    @ExpectedDatabase(value = "/db/create-person.xml", assertionMode = DatabaseAssertionMode.NON_STRICT_UNORDERED)
    public void testCreate() throws JSONException{
        Person person = new Person();
        person.setName("Dani");
        person.setSurname("Sanchez");

        HttpEntity<Person> entity = new HttpEntity<Person>(person, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/person"),
                HttpMethod.POST, entity, String.class);

        JSONAssert.assertEquals("{'id': 5, 'name': 'Dani', 'surname': 'Sanchez'}", response.getBody(), false);
    }

    @Test
    @DatabaseSetup("/db/initial-person.xml")
    @ExpectedDatabase(value = "/db/delete-person.xml", assertionMode = DatabaseAssertionMode.NON_STRICT_UNORDERED)
    public void testDelete() throws JSONException {
        // Act
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/person"),
                HttpMethod.DELETE, null, String.class);

        // Assert
        JSONAssert.assertEquals("{}", response.getBody(), false);
    }

    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
}
