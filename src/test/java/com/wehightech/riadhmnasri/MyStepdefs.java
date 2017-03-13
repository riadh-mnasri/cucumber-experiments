package com.wehightech.riadhmnasri;


import cucumber.api.java8.En;

public class MyStepdefs implements En {
    public MyStepdefs() {
            Given("I have (\\d+) cukes in my belly", (Integer cukes) -> {
            System.out.format("Cukes: %n\n", cukes);
        });
    }
}