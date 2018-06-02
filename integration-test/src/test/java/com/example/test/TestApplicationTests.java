package com.example.test;

import com.example.test.member.Member;
import com.example.test.member.MemberService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {


    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @Autowired
    private MemberService memberService;

    @Before
    public void setUp() throws Exception {
        mockMvc = webAppContextSetup(webApplicationContext).build();
    }

//    @TestConfiguration
//    static class EmployeeServiceImplTestContextConfiguration {
//
//        @Bean
//        public EmployeeService employeeService() {
//            return new EmployeeServiceImpl();
//        }
//    }


    @Test
	public void contextLoads() {
        Member member = memberService.findById(1l);
        System.out.println(member.getEmail());
//        mockMvc.perform(post("tetst").content(this.)).conte.andExpect()

    }

}
