package pratica;

public class Professor extends Pessoas{

    private float salario;

    public Professor(String nome, String cpf, float salario ) {
        super(nome, cpf);
        this.salario = salario;
    }

    //metodo

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salario " + salario);
    }
}
