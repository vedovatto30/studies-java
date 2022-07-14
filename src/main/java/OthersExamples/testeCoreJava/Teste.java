package OthersExamples.testeCoreJava;
import OthersExamples.testeCoreJava.entities.Products;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de valores no vetor");

        int num = sc.nextInt();
        Products[] vect = new Products[num];

        for(int i = 0; i < vect.length; i++){
            sc.nextLine();
          String name = sc.nextLine();
          double price = sc.nextDouble();
          vect[i] = new Products(name, price); //dessa maneira o novo produto é instanciado e inserido
            //dentro do vetor
        }
        double soma = 0.0;
                for( int i = 0; i < vect.length; i++){
                    soma = soma + vect[i].getPrice() ; // atraves do getPrice indicamos para pegar apenas os valoes
                    // do price
                }

                double avg = soma / num;

        System.out.printf("test" + avg);

        sc.close();
    }
}