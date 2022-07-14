package com.example.multitheading;

    public class SingleThreaded {
        public static void main(String[] args) {

            SingleThreaded st = new SingleThreaded(); //criado o objeto para apresentação dos numeros
            st.printNumbers(); //objeto recebendo o metodo para impressão

            for (int j = 1; j <= 200; j++) {
                System.out.println("j :" + j + "\t");  //siginifica que ele separara cada valor com caractere de tabulação
            }
        }
        //Portanto, nesta classe, estamos imprimindo os números de 1 a 200 dentro do método principal, primeiro invocando o
        //printNumbers que imprimirá i, o valor de i. E então, depois de invocar esse método,

        void printNumbers() {
            for (int i = 1; i <= 200; i++) {
                System.out.println("i :" + i + "\t");  //siginifica que ele separara cada valor com caractere de tabulação
            }
        }
    }


