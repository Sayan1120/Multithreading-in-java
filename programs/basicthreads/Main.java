package com.multithreading_java.programs.basicthreads;

public class Main {
    public static void main(String[] args) {

        Company company = new Company();
        Producer pro = new Producer(company);
        Consumer con = new Consumer(company);

        //Calling the Threads
        pro.start();
        con.start();

    }
}
