package com.example.multitheading;

public class SleepMethod extends Thread{
    public static void main(String[] args) throws InterruptedException {
        MultiThreaded mt = new MultiThreaded();
        mt.start(); // Incremento semelhante ao Thread que, por sua vez, criará um espaço de encadeamento para este encadeamento e invocará método run internamente.
        for (int j = 1; j <= 200; j++) {
            System.out.println("j :" + j + "\t");  //siginifica que ele separara cada valor com caractere de tabulação
            Thread.sleep(1000); // ao inserir esse sleep é "necessário apresentar" o throws InterruptedException acima
        }
    }
    public void run(){
        for (int i = 1; i <= 200; i++) {
            System.out.println("i :" + i + "\t");
            try {
                Thread.sleep(1000); // Thread.sleep(1000) ao passar com o mouse ele apresenta o trycatch
            } catch (InterruptedException e) {
                System.out.println("Child Thread Existing");
            }
        }

    }
}

