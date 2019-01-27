package com.example.resolver.member;


import com.example.resolver.config.MemberSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
public class MemberController {

    @GetMapping
    public Member test(@MemberSession Member member) {
        return member;
    }

}
