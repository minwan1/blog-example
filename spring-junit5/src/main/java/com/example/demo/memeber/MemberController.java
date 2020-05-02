package com.example.demo.memeber;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {
    
    private final MemberService memberService;
    

    @GetMapping("/{id}")
    public Member getMember(@PathVariable Long id){
        return memberService.getMember(id);
    }
}
