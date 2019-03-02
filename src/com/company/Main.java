package com.company;

public class Main {

    public static void main(String[] args) {
        Thread fs = new Thread(new Example1());
        fs.setDaemon(false);
        fs.start();
        Example1 printer = new Example1();
        printer.print(5, "Diploma");

        System.out.println("Main thread");
    }
}
