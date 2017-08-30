package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.GroupDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Group;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
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
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        DbUnitTestExecutionListener.class})
public class GroupControllerIT {


    @LocalServerPort
    private int port;

    @Autowired
    private GroupDAO dao;

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
    @DatabaseSetup("/initial-group.xml")
    public void testFindAllWithContent() throws JSONException {
        //Arrange

        // Act
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/group"),
                HttpMethod.GET, null, String.class);

        // Assert
        JSONAssert.assertEquals("[{'id': 1, 'name':'amigos'},{'id': 2, 'name':'familia'}]", response.getBody(), false);
    }

    //falta arreglar este test
    @Test
    @DatabaseSetup("/initial-group.xml")
    public void testFindOne() throws JSONException {
        // Act
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/GroupTable/1"),
                HttpMethod.GET, null, String.class);

        // Assert
        JSONAssert.assertEquals("{'id'=1, 'name'='amigos'}", response.getBody(), false);
    }

    @Test
    public void testCreate() throws JSONException{
        Group g1 = new Group();
        g1.setName("trabajo");

        HttpEntity<Group> entity = new HttpEntity<Group>(g1, headers);
        ResponseEntity<String> response = restTemplate.exchange(createURLWithPort("/group"), HttpMethod.POST, entity, String.class);

        JSONAssert.assertEquals("{'id': 5, 'name': 'trabajo'}", response.getBody(), false);
    }

//    @Test
//    @DatabaseSetup("/initial-person.xml")
//    @ExpectedDatabase(value = "/delete-person.xml", assertionMode = DatabaseAssertionMode.NON_STRICT_UNORDERED)
//    public void testDelete() throws JSONException {
//        // Act
//        ResponseEntity<String> response = restTemplate.exchange(
//                createURLWithPort("/person/5"),
//                HttpMethod.DELETE, null, String.class);
//
//        // Assert
//        JSONAssert.assertEquals(null, response.getBody(), false);
//    }

    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
}
