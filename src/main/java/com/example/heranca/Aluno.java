package com.example.heranca;

public class Aluno extends Pessoas{
    private float registro;

    //construtor
    public Aluno(String nome, String cpf, float registro){
        super(nome, cpf);
        this.registro = registro;

    }

    //metodo

    @Override
    public void imprimi() {
        super.imprimi();
        System.out.println("Registro " + registro);
    }
}
