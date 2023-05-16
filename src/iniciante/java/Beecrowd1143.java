package iniciante.java;

/*Escreva um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1143 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println(i + " " + (i*i) + " " + (i*i*i));
        }

        scan.close();
    }
}