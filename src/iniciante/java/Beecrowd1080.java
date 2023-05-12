package iniciante.java;

/*Leia 100 valores inteiros. Apresente então o maior valor lido e a posição
dentre os 100 valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo
abaixo. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1080 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int maior = 0;
        int posicao = 0;
        int num;

        for (int i=1; i<=100; i++) {
            num = scan.nextInt();
            if (num > maior) {
                maior = num;
                posicao = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);

        scan.close();
    }
}