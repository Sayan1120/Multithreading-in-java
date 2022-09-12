package com.multithreading_java.programs.basics;

public class MainThread1 implements Runnable{
    /**
     * To create a thread in java, there are two ways:
     * -> Using Runnable Interface
     * -> Using Thread Class
     */
    // run() method is from the Runnable interface
    @Override
    public void run(){
        // Performing a task
        for(int i = 0; i < 10; i++){
            System.out.print(i + " ");

            // Using a sleep method to give a break for 1 second for every iteration
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {

        MainThread1 mt1 = new MainThread1();

        Thread t1 = new Thread(mt1);

        // Object of another thread
        MainThread2 mt2 = new MainThread2();

        // When multiple threads are executing together. It is known as concurrent execution

        t1.start();
        mt2.start();

    }
}
