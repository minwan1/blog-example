package com.example.test.config;

import com.example.test.member.Member;
import com.example.test.member.MemberRepository;
import com.example.test.rest.AService;
import com.example.test.rest.RestService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//public class AppConfig {
//
//    @Bean
//    public CommandLineRunner commandLineRunner(MemberRepository memberRepository) {
//        return args -> {
//            memberRepository.save(new Member("test1@naver.com", "test1", "test111","test"));
//            memberRepository.save(new Member("test2@naver.com", "test2", "test222","test"));
//            memberRepository.save(new Member("test3@naver.com", "test3", "test333","test"));
//        };
//    }
//}
