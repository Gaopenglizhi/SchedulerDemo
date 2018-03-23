package com.example.demo;

public class StringTest {
    public static void main(String[] args) {
        String s  = "1";
        String s1 = "123";
        String s2 = new String("123");
        String s3 = s  + new String("23");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        String s4 = s2.intern();
        System.out.println(s1 == s4);
    }
}
