package com.mycompany.app;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String s  = "Hello world";
        String s2 = s.replace(' ', 'x');
        System.out.println(s2);

        Object b = null;
        if (b != null)
            b.notify();
    }
}
