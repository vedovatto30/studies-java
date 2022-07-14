package pratica;

public class Pessoas {

    private String nome;
    private String cpf;

    //construtor
    public Pessoas(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    //metodo
    public void imprime(){
        System.out.println("Nome " + nome);
        System.out.println("Cpf " + cpf);

    }
}
