package com.example.demo.memeber;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    
    private final MemberRepository memberRepository;

    public Member getMember(Long id) {
        return memberRepository.findById(id);
    }
}
