package com.example.heranca;

public class Pessoas {
    private String nome;
    private String cpf;

    //construtor
    public Pessoas(String nome, String cpf){
        this.nome = this.nome;
        this.cpf = this.cpf;
    }

    //metodo
    public void imprimi(){
        System.out.println("Nome " + nome);
        System.out.println("cpf " + cpf);
    }
}
