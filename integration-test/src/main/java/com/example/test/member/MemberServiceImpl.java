package com.example.test.member;

import com.example.test.rest.RestService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService{

    private MemberRepository memberRepository;
    private RestService restService;

    @Override
    public Member findById(Long id) {
        final Member member = memberRepository.findOne(id);
        if(member == null) throw new NullPointerException("member is null");

        restService.test();
        return member;
    }
}
