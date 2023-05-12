package iniciante.java;

/*Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares
consecutivos a partir de X, um valor por linha, inclusive o X ser for o
caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1070 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int cont = 1;

        while (cont < 7) {
            if (num % 2 != 0) {
                System.out.println(num);
                cont++;
            }
            num++;
        }

        scan.close();
    }
}