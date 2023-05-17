package iniciante.java;

/*Leia um valor X. Coloque este valor na primeira posição de um vetor
 N[100]. Em cada posição subsequente de N (1 até 99), coloque a metade do
 valor armazenado na posição anterior, conforme o exemplo abaixo. Imprima o
 vetor N.

Entrada
A entrada contem um valor de dupla precisão com 4 casas decimais.

Saída
Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do
vetor e Y é o valor armazenado naquela posição. Cada valor do vetor deve
ser apresentado com 4 casas decimais. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1178 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double[] N = new double[100];
        N[0] = scan.nextDouble();
        System.out.printf("N[0] = %.4f%n", N[0]);

        for (int i=1; i<N.length; i++) {
            N[i] = N[i-1] / 2;
            System.out.printf("N[%d] = %.4f%n",i, N[i]);
        }

        scan.close();
    }
}