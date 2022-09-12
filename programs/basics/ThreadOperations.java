package com.multithreading_java.programs.basics;

public class ThreadOperations {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program started...");
        int a = 12 + 34;
        System.out.println("The value of a: " + a);

        Thread t = Thread.currentThread();
        String threadName = t.getName();
        System.out.println("The thread running currently is: " + threadName);

        // Setting a new thread name
        t.setName("MyNewMain");
        System.out.println("The new thread name is " + t.getName());

        // sleep() method needs to be kept in try/catch block because it throws exception
        try {
            Thread.sleep(3500);
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }

        // To get the ID of the main thread
        System.out.println(t.getId());

        // Starting the user defined thread.
        UserThread tu = new UserThread();
        tu.start();

        System.out.println("Program ended....");
    }

    public static class UserThread extends Thread{

        @Override
        public void run(){
            // task for thread
            System.out.println("This is user defined thread.");
        }
    }
}
