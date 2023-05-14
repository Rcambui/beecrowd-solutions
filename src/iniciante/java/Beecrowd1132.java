package iniciante.java;

/*Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos
números que não são múltiplos de 13 entre X e Y, incluindo ambos.

Entrada
O arquivo de entrada contém 2 valores inteiros quaisquer, não
necessariamente em ordem crescente.

Saída
Imprima a soma de todos os valores não divisíveis por 13 entre os dois
valores lidos na entrada, inclusive ambos se for o caso. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1132 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt(), y = scan.nextInt();
        if (x > y) {
            int aux = x;
            x = y;
            y = aux;
        }

        int soma = 0;

        for (int i=x; i<=y; i++) {
            if (i % 13 == 0) {
                continue;
            }
            soma += i;
        }

        System.out.println(soma);

        scan.close();
    }
}