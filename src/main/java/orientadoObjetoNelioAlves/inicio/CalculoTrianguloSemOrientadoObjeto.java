package orientadoObjetoNelioAlves.inicio;

import java.util.Scanner;

public class CalculoTrianguloSemOrientadoObjeto {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Insira as medidas do triangulo X");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Insira as medidas do triangulo Y");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        // area = raiz de p(p - a)(p - b)(p - c)     e   p = a+b+c / 2

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));  // Math.sqrt sinal para raiz quadrada

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf(" Triangulo x area: %.4f%n", areaX);
        System.out.printf(" Triangulo y area: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Maior é a X");
        }else{
            System.out.println("maior é a Y");
        }

        sc.close();
    }

}
