package com.example.restdocs.member;

import org.springframework.stereotype.Service;

@Service
public class MemberService {
    
    public Member getMember(Long id){
        return new Member(id, "wan");
    }
}
