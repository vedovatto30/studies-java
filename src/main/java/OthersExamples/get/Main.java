package OthersExamples.get;

public class Main {
    public static void main(String[] args) {

        int num=0;

        Jogador j1 = new Jogador(++num);
        Jogador j2 = new Jogador(++num);
        Jogador j3 = new Jogador(++num);

        System.out.println("Vidas do jogador 1: " + j1.getVidas());
    }
}
