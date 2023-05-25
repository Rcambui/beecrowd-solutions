package iniciante.java;

/* Escreva um algoritmo que leia um inteiro N (0 ≤ N ≤ 100), correspondente a ordem de uma matriz M de inteiros,
e construa a matriz de acordo com o exemplo abaixo.

Entrada
A entrada consiste de vários inteiros, um valor por linha, correspondentes as ordens das matrizes a serem
construídas. O final da entrada é marcado por um valor de ordem igual a zero (0).

Saída
Para cada inteiro da entrada imprima a matriz correspondente, de acordo com o exemplo. (os valores das matrizes
devem ser formatados em um campo de tamanho 3 justificados à direita e separados por espaço. Após o último
caractere de cada linha da matriz não deve haver espaços em branco. Após a impressão de cada matriz deve ser
deixada uma linha em branco.*/

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1478 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        for(int N = leitor.nextInt(); N != 0; N = leitor.nextInt()) {
            for(int i = 1; i <= N; ++i) {
                int x = i;

                for(int j = 1; j <= N; ++j) {
                    if (i == j) {
                        x = 1;
                    }

                    System.out.printf("%3d", x);
                    if (j < N) {
                        System.out.print(" ");
                    } else {
                        System.out.print("\n");
                    }

                    if (j >= i) {
                        ++x;
                    } else {
                        --x;
                    }
                }
            }

            System.out.printf("\n");
        }

        leitor.close();
    }
}
