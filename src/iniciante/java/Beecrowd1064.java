package iniciante.java;

/*Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados,
com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante.
Pelo menos um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos.
A próxima linha deve mostrar a média dos valores positivos digitados.*/

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1064 {
    public Beecrowd1064() {
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double soma = 0.0;
        int positivos = 0;

        for(int i = 0; i < 6; ++i) {
            double num = scan.nextDouble();
            if (num >= 0.0) {
                soma += num;
                ++positivos;
            }
        }

        double media = soma / (double)positivos;
        System.out.println(positivos + " valores positivos");
        System.out.printf("%.1f%n", media);
        scan.close();
    }
}
