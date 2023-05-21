package iniciante.java;

/*Leia um caractere maiúsculo, que indica uma operação que deve ser
realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a
média considerando somente aqueles elementos que estão abaixo da diagonal
Secundária da matriz, conforme ilustrado abaixo (área verde).


Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou
'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os
elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a
matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto
decimal. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1186 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double[][] matriz = new double[12][12];

        char O = scan.next().charAt(0);

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                matriz[i][j] = scan.nextDouble();
            }
        }

        double sum = 0;
        int count = 0;

        for (int i=1; i<matriz.length; i++) {
            for (int j=matriz.length - i; j<matriz[i].length; j++) {
                sum += matriz[i][j];
                count++;
            }
        }

        if (O == 'S') {
            System.out.printf("%.1f%n", sum);
        }
        else {
            double media = sum / count;
            System.out.printf("%.1f%n", media);
        }

        scan.close();
    }
}
