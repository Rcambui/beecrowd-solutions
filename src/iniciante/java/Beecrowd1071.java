package iniciante.java;

/*Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos
números impares entre eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro. Este valor é a soma dos valores
ímpares que estão entre os valores fornecidos na entrada que deverá caber
em um inteiro. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1071 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int z;
        int soma = 0;

        if (x > y) {
            z = x;
            x = y;
            y = z;
        }

        for (int i=x+1; i<y; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);

        scan.close();
    }
}