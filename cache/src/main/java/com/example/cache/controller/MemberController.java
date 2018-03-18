package com.example.cache.controller;


import com.example.cache.domain.Member;
import com.example.cache.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/{id}")
    public Member findById(@PathVariable long id){
        return memberService.findById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteMember(@PathVariable long id){
        memberService.deleteMember(id);
        return "test";
    }

}
