package com.company.Printer;

public class SynchronizedThread {
    public static void main(String[] args) {
        Printer printer = new Printer("HP");
        Islambek islambek = new Islambek(printer);
        Altynbek altynbek = new Altynbek(printer);
        Shabdan shabdan = new Shabdan(printer);

        Thread t1 = new Thread(islambek);
        Thread t2 = new Thread(altynbek);
        Thread t3 = new Thread(shabdan);

        System.out.println("Before t1");
        t1.start();
//        try {
//            t1.join();
//        }
//        catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("Before t2");
        t2.start();
//        try {
//            t2.join();
//        }
//        catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("Before t3");
        t3.start();
//        try {
//            t3.join();
//        }
//        catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("Main Thread");
    }
}

class Islambek implements Runnable {
    Printer printer;

    public Islambek(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printDoc(5, "Galaxy");
    }
}

class Altynbek implements Runnable {
    Printer printer;

    public Altynbek(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printDoc(5, "Contract");
    }
}

class Shabdan implements Runnable {
    Printer printer;

    public Shabdan(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printDoc(5, "CV");
    }
}

class Printer {
    String name;

    public Printer(String name) {
        this.name = name;
    }

    synchronized void printDoc(int num, String document) {
        System.out.println("Printing Documents");
        for (int i = 1; i <= num; i++){
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("[" + name + "] Printing document: " + i + ", " + document);
        }
    }
}