package Les2.MultIThreadingOefeningen.WhatALifeMultiThreadingProject;

public class Life implements Runnable {
boolean alive = true;
    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName()+ " lives! Mwahaha! I have created life!");



    }
}
