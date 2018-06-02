package com.example.test.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = AService.class)
public class AServiceTest {

    @Autowired
    private AService aService;

    @Test
    public void name() {
        aService.test();
    }
}