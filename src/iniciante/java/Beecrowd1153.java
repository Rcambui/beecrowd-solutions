package iniciante.java;

/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de
N = N * (N-1) * (N-2) * (N-3) * ... * 1.

Entrada
A entrada contém um valor inteiro N (0 < N < 13).

Saída
A saída contém um valor inteiro, correspondente ao fatorial de N. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1153 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        System.out.println(fatorial(n));

        scan.close();
    }

    public static int fatorial(int n) {
        if (n < 2) return 1;

        return n * fatorial(n-1);

    }
}