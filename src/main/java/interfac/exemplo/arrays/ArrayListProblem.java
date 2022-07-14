package interfac.exemplo.arrays;


import java.util.Scanner;

public class ArrayListProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de valores no vetor");
        int num = sc.nextInt();

        System.out.println("Informe os valores do vetor");
        double[] vet = new double[num];
        for(int i = 0; i < num; i++){
            vet[i] = sc.nextDouble();
        }

        double soma = 00.00;
        for(int i = 0; i < num; i++){
            soma += vet[i];
        }

        System.out.println("O valor da soma é " + soma);

        sc.close();
    }
}