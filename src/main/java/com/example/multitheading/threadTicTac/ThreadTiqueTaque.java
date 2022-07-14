package com.example.multitheading.threadTicTac;

public class ThreadTiqueTaque implements Runnable {

    TiqueTaque tt;
    Thread t;

    final int NUM = 5;

    public ThreadTiqueTaque(String nome, TiqueTaque tt){ // construtor recebendo o nome da Thread e istancia da classe tiquetaque
        this.tt = tt;
        new Thread(this, nome);
        t.start();
    }

    @Override
    public void run() {

        if(t.getName().equalsIgnoreCase("Tique")){
            for(int i = 0 ; i < NUM; i++ ){
                tt.tique(true);
            }
            tt.tique(false);
        }else{
            tt.taque(true);
        }
        tt.tique(false);
        }

    }

