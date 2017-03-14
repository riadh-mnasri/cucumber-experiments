package com.wehightech.riadhmnasri;

import cucumber.api.java8.En;
import org.junit.Assert;

public class MyStepdefs implements En {
    private MyService myService = new MyService();
    public MyStepdefs() {
            Given("I have (\\d+) cukes in my belly", (Integer cukes) -> {
            System.out.println("Cukes number :: "+ cukes);
        });

        When("^I wait (\\d+) hour$", (Integer hour) -> {
            // Write code here that turns the phrase above into concrete actions
             System.out.println("Hour number :: "+ hour);

        });

        Then("^my belly should growl$", () -> {
            // Write code here that turns the phrase above into concrete actions
            myService.doSomething();
            Assert.assertTrue(true);
        });

    }
}