package iniciante.java;

/*Escreva um programa que leia dois valores X e Y. A seguir, mostre uma
sequência de 1 até Y, passando para a próxima linha a cada X números.

Entrada
O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y <
100000).

Saída
Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em
branco entre cada número, conforme exemplo abaixo. Não deve haver espaço
em branco após o último valor da linha. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1145 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();
        int Y = scan.nextInt();
        int cont = 1;

        while (cont <= Y) {
            for (int i=1; i<=X; i++) {
                if (i == X) { System.out.println(cont); }
                else { System.out.print(cont + " ");}
                cont++;
            }
        }

        scan.close();
    }
}