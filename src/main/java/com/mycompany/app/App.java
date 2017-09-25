package com.mycompany.app;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String s  = "Hello world";
        s.replace(' ', 'x');
        System.out.println(s);

        Object b = null;
        if (b != null)
            b.notify();
    }
}
