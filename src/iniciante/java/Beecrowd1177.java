package iniciante.java;

/*Faça um programa que leia um valor T e preencha um vetor N[1000] com a
sequência de valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo.
Imprima o vetor N.

Entrada
A entrada contém um valor inteiro T (2 ≤ T ≤ 50).

Saída
Para cada posição do vetor, escreva "N[i] = x", onde i é a posição do vetor
e x é o valor armazenado naquela posição. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1177 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int[] N = new int[1000];
        int num = scan.nextInt();
        int index = 0;

        while (index < 1000) {
            for (int i=0; i<num; i++) {
                N[index] = i;
                System.out.println("N[" + index + "] = " + i);
                index++;
                if (index >= 1000) break;
            }
        }


        scan.close();
    }
}
