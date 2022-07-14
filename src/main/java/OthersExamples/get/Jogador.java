package OthersExamples.get;

public class Jogador {

    private int num = 0;
    private int vidas = 0;

    public Jogador(int num){
        this.num = num;
        this.vidas = 3;
        System.out.println("Jogador numero " + num + " criado" );
    }

    public int getVidas() {
        return vidas;
    }
}
