package iniciante.java;

/* Leia um valor inteiro N que é o tamanho da matriz que deve ser impressa conforme o modelo fornecido.

Entrada
A entrada contém vários casos de teste e termina com EOF. Cada caso de teste é composto por um único
inteiro N (3 ≤ N < 70), que determina o tamanho (linhas e colunas) de uma matriz que deve ser impressa.

Saída
Para cada N lido, apresente a saída conforme o exemplo fornecido.*/

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.Scanner;
public class Beecrowd1534 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int N;

        while (scan.hasNext()) {
            N = scan.nextInt();

            for (int i=0; i<N; i++) {
                for (int j=0; j<N; j++) {
                    if (j == N-i-1) { System.out.print(2); }
                    else if (i == j) { System.out.print(1); }
                    else { System.out.print(3); }
                }

                    System.out.println();
            }
        }

        scan.close();
    }
}
