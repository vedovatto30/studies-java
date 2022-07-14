package orientadoObjetoNelioAlves.inicio;

import java.util.Scanner;

public class CalculoTrianguloUsandoClasseTriangulo {


    public class CalculoTrianguloSemOrientadoObjeto {

        public void main(String[] args) { // aqui seria necessário inserir o public static void,
            // mas ja esxiste a classe principal
            Scanner sc  = new Scanner(System.in);
            Triangulo x, y;
            x = new Triangulo();
            y = new Triangulo();

            System.out.println("Insira as medidas do triangulo X");
            x.a = sc.nextDouble();
            x.b = sc.nextDouble();
            x.c = sc.nextDouble();

            System.out.println("Insira as medidas do triangulo Y");
            y.a = sc.nextDouble();
            y.b = sc.nextDouble();
            y.c = sc.nextDouble();
            // area = raiz de p(p - a)(p - b)(p - c)     e   p = a+b+c / 2

            double p = (x.a + x.b + x.c)  / 2.0;
            double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));  // Math.sqrt sinal para raiz quadrada

            p = (y.a + y.b + y.c) / 2.0;
            double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

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

}
