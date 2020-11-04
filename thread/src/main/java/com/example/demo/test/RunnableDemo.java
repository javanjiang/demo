package com.example.demo.test;

/**
 * @auther javan
 * @date 2020/10/27 17:16
 */
public class RunnableDemo implements Runnable {

    private Thread t;
    private String threadName;

    public RunnableDemo(String name) {
        System.out.println("creating"+threadName);

    }

    @Override
    public void run() {
        System.out.println("running"+threadName);
        for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // 让线程睡眠一会
            Thread.sleep(50);
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start() {
    }
}

