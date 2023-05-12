package iniciante.java;

/*Maria acabou de iniciar seu curso de graduação na faculdade de medicina
e precisa de sua ajuda para organizar os experimentos de um laboratório o
qual ela é responsável. Ela quer saber no final do ano, quantas cobaias
foram utilizadas no laboratório e o percentual de cada tipo de cobaia
utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos
e coelhos. Para obter estas informações, ela sabe exatamente o número de
experimentos que foram realizados, o tipo de cobaia utilizada e a
quantidade de cobaias utilizadas em cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os
vários casos de teste que vem a seguir. Cada caso de teste contém um
inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias
utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de
cobaia (R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia
utilizada e o percentual de cada uma em relação ao total de cobaias
utilizadas, sendo que o percentual deve ser apresentado com dois dígitos
após o ponto. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1094 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int total = 0;
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;

        int num = scan.nextInt();

        for (int i=0; i<num; i++) {
            int quantidade = scan.nextInt();
            char sigla = scan.next().charAt(0);

            switch (sigla) {
                case 'C': coelhos += quantidade; break;
                case 'R': ratos += quantidade; break;
                case 'S': sapos += quantidade; break;
            }
            total += quantidade;
        }

        double percentCoelho = (coelhos * 100.0) / total;
        double percentRato = (ratos * 100.0) / total;
        double percentSapo = (sapos * 100.0) / total;

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        System.out.printf("Percentual de coelhos: %.2f %%%n", percentCoelho);
        System.out.printf("Percentual de ratos: %.2f %%%n", percentRato);
        System.out.printf("Percentual de sapos: %.2f %%%n", percentSapo);

        scan.close();
    }
}