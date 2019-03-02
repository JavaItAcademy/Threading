package com.company;

public class ThreadingExample implements Runnable {

    String[] people;

    public ThreadingExample(String... people) {
        this.people = people;
    }

    @Override
    public void run() {
        for (int i = 0; i < people.length; i++){
            try{
                Thread.sleep(1000);
                System.out.println("Обслужил: " + people[i]);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadingExample t1 = new ThreadingExample("1 Kanat", "1 Elvira", "1 Aigerim", "1 Aselia", "1 Astan");
        Thread thread1 = new Thread(t1);
        //thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();

        ThreadingExample t2 = new ThreadingExample("2 Aidana", "2 Danil", "2 Shabdan", "2 Altynbek", "2 Islambek");
        Thread thread2 = new Thread(t2);
        //thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.start();

        System.out.println("Main thread");
    }
}
