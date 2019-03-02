package com.company;

public class Example1 implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Certificate: " + i);
        }
    }

    public void print(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text + ": " + i);
        }
    }
}
