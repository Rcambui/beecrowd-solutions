package iniciante.java;

/*Você deve fazer um programa que apresente a sequencia conforme o exemplo
abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo */

import java.io.IOException;

public class Beecrowd1096 {
    public static void main(String[] args) throws IOException {

        for (int i=1; i<=9; i+=2) {
            for (int j=7; j>=5; j--) {
                System.out.println("I=" + i + " J=" + j);
            }
        }
    }
}