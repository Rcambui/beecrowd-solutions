package iniciante.java;

/*Leia um caractere maiúsculo, que indica uma operação que deve ser
realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a
média considerando somente aqueles elementos que estão abaixo da diagonal
principal da matriz, conforme ilustrado abaixo (área verde).

Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou
'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os
elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto
decimal. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1184 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double[][] matriz = new double[12][12];

        char O = scan.next().charAt(0);
        double num;

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                num = scan.nextDouble();
                matriz[i][j] = num;
            }
        }

        double sum = 0;
        int cont = 0;

        for (int i=0; i<matriz.length; i++) {
            for (int j= 0; j<i; j++) {
                sum += matriz[i][j];
                cont++;
            }
        }

        if (O == 'S') {
            System.out.printf("%.1f%n", sum);
        }
        else {
            double media = sum / cont;
            System.out.printf("%.1f%n", media);
        }

        scan.close();
    }
}