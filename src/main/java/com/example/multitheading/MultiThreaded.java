package com.example.multitheading;

public class MultiThreaded extends Thread{  //o Thread é incremento do Java.leng

    public static void main(String[] args) {
        MultiThreaded mt = new MultiThreaded();
        mt.start(); // Start é o metodo que cria as Thread, é um metodo interno ao java, por sua vez, criará um espaço de encadeamento para este encadeamento e invocará método run internamente.
        for (int j = 1; j <= 200; j++) {
            System.out.println("j :" + j + "\t");  //siginifica que ele separara cada valor com caractere de tabulação
        }
    }
        public void run(){
                for (int i = 1; i <= 200; i++) {
                    System.out.println("i :" + i + "\t");  //siginifica que ele separara cada valor com caractere de tabulação
        }
                //A execução deste para deste segmento está acontecendo sequencialmente. Portanto, a execução alterna entre esses dois, porque
            // este é um thread separado e o método principal também é um thread separado.
            //i :1 //j :2 //j :3 //i :2 //j :4 //i :3 //j :5
    }
}


