package iniciante.java;

/*Faça um algoritmo para ler um valor A e um valor N. Imprimir a soma de
A + i para cada i com os valores (0 <= i <= N-1). Enquanto N for negativo
ou ZERO, um novo N(apenas N) deve ser lido.

Entrada
A entrada contém somente valores inteiros, podendo ser positivos ou
negativos. Todos os valores estão na mesma linha.

Saída
A saída contém apenas um valor inteiro. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1149 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int N = scan.nextInt();
        while (N <= 0) {
            N = scan.nextInt();
        }
        int sum = 0;

        for (int i=0; i<N; i++) {
            sum += A + i;
        }

        System.out.println(sum);

        scan.close();
    }
}