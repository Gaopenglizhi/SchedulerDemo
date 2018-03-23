package com.example.demo;

public class DtataTest {

    public static void main(String[] args) {
        int [] a={10,20};
        System.out.print("交换结束前:a="+a[0]);
        change(a);
        System.out.print("交换结束后:a="+a[0]);
    }

    public static void change(int [] a) {
        a[0] = 20;
        System.out.println("在change方法中：a="+a[0]);
    }
}
