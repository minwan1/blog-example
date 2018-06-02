package com.example.demo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "name", "timestamp"})
public class PayloadDto {

    private String id;
    private String name;
    private String timestamp;


    public PayloadDto(String id, String name, String timestamp) {
        this.id = id;
        this.name = name;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
