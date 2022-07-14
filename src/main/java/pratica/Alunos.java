package pratica;

public class Alunos extends Pessoas{

    private float registro;


    public Alunos(String nome, String cpf, float registro) {
        super(nome, cpf);
        this.registro = registro;
    }

    //metodo

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Registro " + registro);
    }
}
