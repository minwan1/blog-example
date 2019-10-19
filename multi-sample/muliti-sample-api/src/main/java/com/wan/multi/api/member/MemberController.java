package com.wan.multi.api.member;

import com.wan.multi.core.member.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/members")
public class MemberController {

    @GetMapping
    public Member test(){
        return new Member("test");
    }
}
