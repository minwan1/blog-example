package com.example.cache.service;

import com.example.cache.domain.Member;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Cacheable(value = "members", key ="#id")
    public Member findById(long id){
        System.out.println("test");

        if(id == 1)
            return  Member.builder()
                    .id(1)
                    .age(15)
                    .name("김철수")
                    .build();
        else
            return  Member.builder()
                    .id(2)
                    .age(17)
                    .name("김아무개")
                    .build();
    }

    @CacheEvict(value = "members",key ="#id")
    public void deleteMember(long id){
        System.out.println("deleteMember");
    }
}
