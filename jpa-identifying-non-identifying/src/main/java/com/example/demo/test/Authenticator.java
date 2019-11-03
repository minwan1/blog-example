package com.example.demo.test;


public class AuthenticationHandler {
    public void handleRequest(String inputId, String inputPassword){
        Authenticator auth = new Authenticator();
        try{
            auth.authenticate(inputId, inputPassword);
            //패스워드가 일치한경우
        }catch (MemberNotfoundException ex){
            // 아이디가 잘못된경우
        }catch (InvalidPasswordException ex)
            //패스워드가 잘못된경우
    }
}

public class Authenticator {
    public void authenticate(String id, String password){
        Member m = findMemberById(id);
        if(m == null) throw new MemberNotFoundException();
        if(!m.equalsPassword(password)) throw new  InvalidPasswordException()
    }
}
