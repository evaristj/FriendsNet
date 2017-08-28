package com.everis.alicante.courses.beca.summer17.friendsnet;

import com.everis.alicante.courses.beca.summer17.friendsnet.controller.EventControllerIT;
import com.everis.alicante.courses.beca.summer17.friendsnet.controller.PersonControllerIT;
import org.junit.runners.Suite;

/**
 * Created by emingora on 28/08/2017.
 */
@Suite.SuiteClasses({PersonControllerIT.class, EventControllerIT.class})
public class WholeIntegrationTesting {
}
