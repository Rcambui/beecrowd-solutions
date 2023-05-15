package iniciante.java;

/*Escreva um programa que leia um valor inteiro N. Este N é a quantidade
de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1142 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int n = num * 4;

        for (int i=1; i<=n; i++) {
            if (i % 4 ==0) {
                System.out.println("PUM");
            }
            else {
                System.out.print(i + " ");
            }
        }

        scan.close();
    }
}