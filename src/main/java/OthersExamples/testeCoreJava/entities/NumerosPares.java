package OthersExamples.testeCoreJava.entities;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de numeros desejados");
        int num = sc.nextInt();
        double[] vec = new double[num];

        System.out.println("Insira os numeros de acordo com a quantidade");
        for (int i = 0; i < num; i++) {
            vec[i] = sc.nextDouble();
        }

        double pares = 00.00;
        for (int i = 0; i < num; i++) {
            if(vec[i]%2 == 0){
                pares = pares + vec[i];
        }
            System.out.printf("A soma dos valores pares são:  " + pares);

        }

        sc.close();

    }
}
