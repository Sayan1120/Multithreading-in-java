package com.multithreading_java.programs.basicthreads;

public class Consumer extends Thread{
    Company comp1;
    public Consumer(Company comp1){
        this.comp1 = comp1;
    }
    @Override
    public void run(){
        while(true){
            try {
                this.comp1.consumeItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                throw new RuntimeException(e);
            }
        }
    }
}
