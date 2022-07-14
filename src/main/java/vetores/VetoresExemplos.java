package vetores;

import java.util.Scanner;

public class VetoresExemplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //pedindo quantas casas sera o vetor
        double[] vet = new double[n];

        for(int i = 0; i < n; i++){ // vetor vai pegar os valores informados e inserindo dentro do vetor
            vet[i] = sc.nextDouble();
        }
        double sum = 0.0; //criando uma variavel soma que ira somar cada numero do vetor
        for (int i = 0 ; i < n; i++ ){
            sum =+ vet[i];
        }
        double media = sum / n; //variavel media que pegara os numeros do vetor dividindo pela quantidade de numeros
        System.out.println(media);
        sc.close();
    }
}
