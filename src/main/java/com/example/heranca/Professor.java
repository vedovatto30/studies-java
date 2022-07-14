package com.example.heranca;

public class Professor extends Pessoas{
    private float salario;

    public Professor(String nome, String cpf, float salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    @Override
    public void imprimi() {
        super.imprimi();
        System.out.println("Salario " + salario);
    }
}
