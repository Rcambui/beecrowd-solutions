package iniciante.java;

/*Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:
1 x N = N      2 x N = 2N        ...       10 x N = 10N

Entrada
A entrada contém um valor inteiro N (2 < N < 1000).

Saída
Imprima a tabuada de N, conforme o exemplo fornecido.*/

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1078 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for (int i=1; i<=10; i++) {
            System.out.println(i + " x " + num + " = " + (i*num));
        }

        scan.close();
    }
}