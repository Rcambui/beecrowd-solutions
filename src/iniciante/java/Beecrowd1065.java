package iniciante.java;
/*Faça um programa que leia 5 valores inteiros. Conte quantos destes
valores digitados são pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de
valores pares lidos. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1065 {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

        int pares = 0;
        int num;

        for (int i=0; i<5; i++) {
            num = scan.nextInt();
            if (num % 2 == 0) {
                pares++;
            }
        }

        System.out.println(pares + " valores pares");

        scan.close();
    }
}