package iniciante.java;

/*Leia um valor inteiro N que é a quantidade de casos de teste que vem a
seguir. Cada caso de teste consiste de dois inteiros X e Y.
Você deve apresentar a soma de todos os ímpares existentes entre X e Y.

Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de
teste que vem a seguir. Cada caso de teste consiste em uma linha contendo
dois inteiros X e Y.

Saída
Imprima a soma de todos valores ímpares entre X e Y. */


import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1099 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int X,Y, N;
        int aux;
        int soma = 0;

        N = scan.nextInt();

        for (int i=0; i<N; i++) {
            X = scan.nextInt();
            Y = scan.nextInt();

            if (X > Y) {
                aux = X;
                X = Y;
                Y = aux;
            }
            X++;
            soma = 0;
            for (int j=X; j<Y; j++) {
                if (j % 2 != 0) {
                    soma += j;
                }
            }
            System.out.println(soma);
        }

        scan.close();
    }
}