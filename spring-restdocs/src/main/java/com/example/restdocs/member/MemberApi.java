package com.example.restdocs.member;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/members")
public class MemberApi {

//    private final MemberService memberService;


    @GetMapping(value = "/email")
    public Member getEmail(
            @RequestParam(name = "type") MemberSearchType type,
            @RequestParam(name = "value", required = false) String value){
//        memberService.getMembers(type, value);
        return null;
    }

    @PostMapping
    public Member create(@RequestBody MemberCreate.Request request){

//        memberService.create(request);
        return null;
    }

    @PostMapping(value = "/test")
    public Member create1(){
        Member build = Member.builder("test@bacer.com").build();
        return build;
//        memberService.create(request);
    }
}
