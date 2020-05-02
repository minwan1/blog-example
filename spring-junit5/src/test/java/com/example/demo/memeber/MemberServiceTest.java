package com.example.demo.memeber;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class MemberServiceTest {
    
    @InjectMocks
    private MemberService memberService;
    
    @Mock
    private MemberRepository memberRepository;

    @Test
    public void getMember(){
        // given
        given(memberRepository.findById(anyLong()))
                .willReturn(new Member(1L, "test"));
        // when
        Member member = memberService.getMember(1L);
        // then
        assertEquals(1L, member.getId());
        assertEquals("test", member.getName());
    }
}
