package iniciante.java;

/*Neste problema você deverá ler 15 valores colocá-los em 2 vetores
conforme estes valores forem pares ou ímpares. Só que o tamanho de cada
um dos dois vetores é de 5 posições. Então, cada vez que um dos dois
vetores encher, você deverá imprimir todo o vetor e utilizá-lo novamente
para os próximos números que forem lidos. Terminada a leitura, deve-se
imprimir o conteúdo que restou em cada um dos dois vetores, imprimindo
primeiro os valores do vetor impar. Cada vetor pode ser preenchido tantas
vezes quantas for necessário.

Entrada
A entrada contém 15 números inteiros.

Saída
Imprima a saída conforme o exemplo abaixo. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1179 {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

        int[] par = new int[5];
        int[] impar = new int[5];

        int index = 1;
        int num;
        int k =0, j=0;

        while (index <= 15) {
            num = scan.nextInt();

            if (num % 2 == 0) {
                par[k] = num;
                k++;
            }
            else {
                impar[j] = num;
                j++;
            }

            if (k == 5) {
                for (int i=0; i<par.length; i++) {
                    System.out.println("par[" + i  + "] = "  + par[i]);
                }
                k = 0;
            }
            if ( j == 5) {
                for (int i=0; i<par.length; i++) {
                    System.out.println("impar[" + i  + "] = "  + impar[i]);
                }
                j = 0;
            }
            index++;
        }

        if (j > 0) {
            for (int i=0; i< j; i++) {
                System.out.println("impar[" + i  + "] = "  + impar[i]);
            }
        }

        if (k > 0) {
            for (int i=0; i< k; i++) {
                System.out.println("par[" + i  + "] = "  + par[i]);
            }
        }

        scan.close();
    }
}