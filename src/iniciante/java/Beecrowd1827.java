package iniciante.java;

/*Neste programa seu trabalho é ler um valor inteiro que será o tamanho da matriz quadrada
(largura e altura) que será preenchida da seguinte forma: a parte externa é preenchida com 0,
a parte interna é preenchida com 1, a diagonal principal é preenchida com 2, a diagonal secundária
é preenchida com 3 e o ponto central contém o valor 4, conforme os exemplos abaixo.

Obs: o quadrado com '1' sempre começa na posição tamanho/3, tanto na largura quanto quanto na altura.
A linha e a coluna começam em zero (0).

Entrada
A entrada contém vários casos de teste e termina com EOF (fim de arquivo. Cada caso de teste consiste
de um valor inteiro ímpar N (5 ≤ N ≤ 101) que é o tamanho da matriz.

Saída
Para cada caso de teste, imprima a matriz correspondente conforme o exemplo abaixo. Após cada caso de
teste, imprima uma linha em branco.*/

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1827 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N, centro, interior, exterior;
        while (scan.hasNext()) {
            N = scan.nextInt();
            centro = N / 2;
            interior = N / 3;
            exterior = (N - 1) - interior;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == centro && j == centro) System.out.print(4);
                    else if (i >= interior && j >= interior && i <= exterior && j <= exterior) System.out.print(1);
                    else if (i == j) System.out.print(2);
                    else if (j == N - i - 1) System.out.print(3);
                    else System.out.print(0);
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }

}