package com.example.multitheading;

public class TesteThread {

    public static void main(String[] args) {
        new Thread(t1).start(); //start inicia o thread
        new Thread(t2).start();

    }

    private static Runnable t1 = new Runnable() { //criando o thred 1 com um for

        public void run() {
            for(int i = 0; i < 10; i++){
                System.out.println("Thread 1: " + i);
            }
        }
    };

    private static Runnable t2 = new Runnable() { //criando o thred  com um for

        public void run() {
            for(int j = 0; j < 10; j++){
                System.out.println("Thread 2: " + j);
            }
        }
    };
}
