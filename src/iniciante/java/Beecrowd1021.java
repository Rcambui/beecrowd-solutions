package iniciante.java;

/*Leia um valor de ponto flutuante com duas casas decimais. Este valor representa
 um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis
no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10,
 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir
 mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor
inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.*/

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1021 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double dinheiro =scan.nextDouble();

        int notas = (int)dinheiro;
        int moedas = (int) ((dinheiro - notas) * 100);

        int nota100 = notas / 100;
        notas -= nota100 * 100;
        int nota50 = notas / 50;
        notas -= nota50 * 50;
        int nota20 = notas / 20;
        notas -= nota20 * 20;
        int nota10 = notas / 10;
        notas -= nota10 * 10;
        int nota5 = notas / 5;
        notas -= nota5 * 5;
        int nota2 = notas / 2;
        notas -= nota2 * 2;
        int moeda1 = notas;

        int moeda50 = moedas / 50;
        moedas -= moeda50 * 50;
        int moeda25 = moedas / 25;
        moedas -= moeda25 * 25;
        int moeda10 = moedas / 10;
        moedas -= moeda10 * 10;
        int moeda5 = moedas / 5;
        moedas -= moeda5 * 5;
        int moeda01 = moedas;

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moeda01 + " moeda(s) de R$ 0.01");


        scan.close();
    }
}
