package iniciante.java;

/*Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os
valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.

Entrada
A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.

Saída
Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor
e x é o valor armazenado naquela posição. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1172 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
        int num;

        for (int i=0; i<arr.length; i++) {
            num = scan.nextInt();

            if (num <= 0) { num = 1;}
            arr[i] = num;
        }

        for (int i=0 ; i<arr.length; i++) {
            System.out.println("X[" + i + "] = " + arr[i]);
        }

        scan.close();
    }
}