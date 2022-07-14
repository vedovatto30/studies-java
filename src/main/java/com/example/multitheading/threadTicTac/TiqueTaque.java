package com.example.multitheading.threadTicTac;

public class TiqueTaque {

    boolean tique; // a variavel ira indicar qual info sera impressa, se tique for true sera ele
    //se não sera o taque

    synchronized void tique(boolean estaExecutando){ //o metodo esta executando verificar se o tique
        //ou o taque esta em funcionamento

        if(!estaExecutando){ // se não esta executando, imprime o tique
            tique = true;
            notify(); //o notify vai comunicar a outra thread que estava aguardando
            return; //retornando e encerrando o metodo
        }
        System.out.print("tique");
        tique = true;
        notify();

        try {
          while (tique) {  // enquanto for tique vamos aguardar a execução
              wait(); //ao digitar wait o sistema informara a necessidade do try cah
          }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void taque(boolean b) {
    }
}
