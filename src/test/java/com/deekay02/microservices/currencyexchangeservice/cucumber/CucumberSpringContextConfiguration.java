package com.deekay02.microservices.currencyexchangeservice.cucumber;

import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;

import com.deekay02.microservices.currencyexchangeservice.CurrencyExchangeServiceApplicationH2;

import cucumber.api.java.Before;

@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = CurrencyExchangeServiceApplicationH2.class, loader = SpringBootContextLoader.class)
public class CucumberSpringContextConfiguration {

  @Before
  public void setUp() {
  }
}