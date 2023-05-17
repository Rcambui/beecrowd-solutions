package iniciante.java;

/*Faça um programa que leia um valor e apresente o número de Fibonacci
correspondente a este valor lido. Lembre que os 2 primeiros elementos da
série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores
a ele. Todos os valores de Fibonacci calculados neste problema devem caber
em um inteiro de 64 bits sem sinal.

Entrada
A primeira linha da entrada contém um inteiro T, indicando o número de
casos de teste. Cada caso de teste contém um único inteiro N (0 ≤ N ≤ 60),
correspondente ao N-esimo termo da série de Fibonacci.

Saída
Para cada caso de teste da entrada, imprima a mensagem "Fib(N) = X", onde
X é o N-ésimo termo da série de Fibonacci. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1176 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int j = 0; j < T; j++) {
            int N = scan.nextInt();
            long anterior = 0, atual = 1, proximo;
            for (int i=0; i < N; i++) {
                proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }
            System.out.println("Fib("+ N +") = " + anterior);
        }

        scan.close();
    }


}