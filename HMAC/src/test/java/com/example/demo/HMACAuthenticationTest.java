package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;


public class HMACAuthenticationTest {

    private final String SECRET = "secret";
    private final String TEST_SIGNATURE = "13bfbd1dec775dc49a96159183570f232deecf41e37910a3b5b6efb7257415be";
    private ObjectMapper mapper;
    private HMACAuthentication hmacAuthentication;


    @Before
    public void setUp() throws Exception {
        hmacAuthentication = new HMACAuthentication();
        mapper = new ObjectMapper();
    }

    @Test
    public void verifySignature_SignatureSuccess_void() throws JsonProcessingException {

        //given
        final PayloadDto payloadDto = buildPayload("test");
        String payload = mapper.writeValueAsString(payloadDto);
        //when
        hmacAuthentication.verifySignature(SECRET, payload, TEST_SIGNATURE);
        //then

    }

    @Test(expected = HMACAuthenticationFailException.class)
    public void verifySignature_SignatureFail_void() throws JsonProcessingException {
        //given
        final PayloadDto payloadDto = buildPayload("fail");
        String payload = mapper.writeValueAsString(payloadDto);
        //when
        hmacAuthentication.verifySignature(SECRET, payload, TEST_SIGNATURE);
        //then
    }

    private PayloadDto buildPayload(String id) {
        return new PayloadDto(id, "test","2018-05-05");
    }
}