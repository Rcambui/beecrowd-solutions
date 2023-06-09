package iniciante.java;

/*Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou
igual a zero). Para cada par lido, mostre a sequência do menor até o maior
e a soma dos inteiros consecutivos entre eles (incluindo o N e M).

Entrada
O arquivo de entrada contém um número não determinado de valores M e N.
A última linha de entrada vai conter um número nulo ou negativo.

Saída
Para cada dupla de valores, imprima a sequência do menor até o maior e a
soma deles, conforme exemplo abaixo. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1101  {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

        int N, M;
        int aux = 0;


        do {
            int soma = 0;
            M = scan.nextInt();
            N = scan.nextInt();

            if (M <= 0 || N <= 0) break;

            if (M > N) {
                aux = M;
                M = N;
                N = aux;
            }

            for (int i=M; i<=N; i++) {
                System.out.print(i + " ");
                soma += i;
            }

            System.out.println("Sum=" + soma);

        } while (true);

        scan.close();
    }
}