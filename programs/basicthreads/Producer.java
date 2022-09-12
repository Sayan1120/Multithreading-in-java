package com.multithreading_java.programs.basicthreads;

public class Producer extends Thread{

    Company comp;
    public Producer(Company comp){
        this.comp = comp;
    }

    @Override
    public void run(){
        int i = 1;
        while(true){
            try {
                this.comp.produceItem(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try{
                Thread.sleep(1500);
            }
            catch(Exception e){
                throw new RuntimeException(e);
            }
            i++;
        }
    }

}
