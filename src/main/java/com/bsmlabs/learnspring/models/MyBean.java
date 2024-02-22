package com.bsmlabs.learnspring.models;

import java.time.LocalDateTime;

public class MyBean {

    private final String dateTimeString = LocalDateTime.now().toString();

    public String getDateTime() {
        return dateTimeString;
    }
}
