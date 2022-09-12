package com.multithreading_java.programs.basics;

public class MainThread2 extends Thread{

    @Override
    public void run(){
        //Performing a task for thread
        for(int i=10; i>1; i--){
            System.out.print(i+" ");
            try{
                Thread.sleep(1500);
            }
            catch(Exception e){
                throw new RuntimeException(e);
            }
        }
    }

}
