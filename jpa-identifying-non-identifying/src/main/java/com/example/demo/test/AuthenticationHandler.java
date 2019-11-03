package com.example.demo.test;

public class AuthenticationHandler {
    public void handleRequest(String inputId, String inputPassword){
        Authenticator auth = new Authenticator();
        if(auth.authenticate(inputId, inputPassword)){
            //아이디암호일치
        }else{
            //아이디암호일치실패
        }
    }
}
