package com.example.demo.memeber;

import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {
    
    public Member findById(Long id) {
        return new Member(id, "test");
    }
}
