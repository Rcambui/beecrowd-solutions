package iniciante.java;

/*Escreva um programa que leia 2 valores X e Y e que imprima todos os
valores entre eles cujo resto da divisão dele por 5 for igual a 2 ou igual
a 3.

Entrada
O arquivo de entrada contém 2 valores positivos inteiros quaisquer,
não necessariamente em ordem crescente.

Saída
Imprima todos os valores conforme exemplo abaixo, sempre em ordem
crescente. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1133 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt(), y = scan.nextInt();

        if (x > y) {
            int aux = x;
            x = y;
            y = aux;
        }

        for (int i=x+1; i<y; i++) {
            int mod = i % 5;
            switch (mod) {
                case 2 :
                case 3 : System.out.println(i); break;
            }
        }

        scan.close();
    }
}