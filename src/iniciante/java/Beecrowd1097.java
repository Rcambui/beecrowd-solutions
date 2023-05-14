package iniciante.java;

/*Você deve fazer um programa que apresente a sequencia conforme o exemplo
abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo. */

import java.io.IOException;


public class Beecrowd1097 {
    public static void main(String[] args) throws IOException {

        int J = 7;
        int G = J;

        for (int i=1; i<=9; i+= 2) {

            while (J > G-3) {
                System.out.println("I=" + i + " J=" + J);
                J--;
            }

            J += 5;
            G = J;
        }
    }
}