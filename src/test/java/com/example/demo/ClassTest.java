package com.example.demo;

import org.junit.Test;

public class ClassTest {
    @Test
    public void a() {
        System.out.println(i);
        System.out.println(b());
        System.out.println(i);
    }

    static int i = 1;

    public int b() {
        try {
           return i;
        } finally {
          i++;
        }
    }
}
