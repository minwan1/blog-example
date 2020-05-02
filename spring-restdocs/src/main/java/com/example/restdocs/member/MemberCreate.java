package com.example.restdocs.member;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

public class MemberCreate {

    @Getter
    public static class Request{
        private String email;
    }
}
