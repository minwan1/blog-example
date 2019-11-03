package com.example.demo.embeddedid;

import javax.persistence.EmbeddedId;

public class Parent {

    @EmbeddedId
    private ParentId id;

    private String name;

}
