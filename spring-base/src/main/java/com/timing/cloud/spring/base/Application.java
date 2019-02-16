package com.timing.cloud.spring.base;

public class Application {
    public static void alloc() {
        byte[] b = new byte[65];
        synchronized (b) {
            b[0] = 1;
        }
    }
    public static void main(String[] args) {
        long b = System.currentTimeMillis();
        for (int i=0; i<100000000; i++) {
            alloc();
        }
        long e = System.currentTimeMillis();
        System.out.println(e-b);
    }

    class child {
        private String name;
        private int a;
    }
}
