package com.example.demo;

public class HMACAuthenticationFailException extends RuntimeException {
    public HMACAuthenticationFailException(String hamcError) {
        super(hamcError);
    }

    public HMACAuthenticationFailException(String hamcError, Exception e) {
        super(hamcError, e);
    }
}
