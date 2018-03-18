package com.example.cache.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class Member implements Serializable{

    private long id;
    private String name;
    private int age;

    @Builder
    public Member(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
