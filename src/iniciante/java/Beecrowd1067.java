package iniciante.java;

/* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares
de 1 até X, um valor por linha, inclusive o X, se for o caso.

Entrada
O arquivo de entrada contém 1 valor inteiro qualquer.

Saída
Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1067 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for (int i=1; i<=num; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        scan.close();
    }
}