package ru.artem2j.buyiter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class ClassForGetPass {

    public static void main(String[] args){
        getPass();
    }

    public static void getPass(){
        BCryptPasswordEncoder bbCryptPasswordEncode = new BCryptPasswordEncoder();
        String pass = bbCryptPasswordEncode.encode("Zo918231");
        System.out.print(pass);
    }
}
