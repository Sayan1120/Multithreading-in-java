package com.multithreading_java.programs.basicthreads;

public class Company {

    int n;
    boolean f = false;
    // f=false: chance: producer
    // f=true chance: consumer

    synchronized public void produceItem(int n) throws InterruptedException {
        // producer will wait for it's chance due to wait()
        if(f){
            wait();
        }
        this.n = n;
        System.out.println("Produced: " + this.n);

        // consumer's chance
        f = true;

        // consumer gets notified about it's chance
        // This is how inter thread communication is achieved.
        notify();
    }
    synchronized public int consumeItem() throws InterruptedException {

        // consumer will wait for it's chance with wait()
        if(!f){
            wait();
        }
        System.out.println("Consumed: " + this.n);

        // After consuming, the producer chance will come
        f = false;

        // the producer gets notified because of notify() about it's chance
        notify();
        return this.n;
    }

}
