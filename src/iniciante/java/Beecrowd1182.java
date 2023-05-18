package iniciante.java;

/*Neste problema você deve ler um número que indica uma coluna de uma matriz
 na qual uma operação deve ser realizada, um caractere maiúsculo, indicando
 a operação que será realizada, e todos os elementos de uma matriz M[12][12].
 Em seguida, calcule e mostre a soma ou a média dos elementos que estão na
 área verde da matriz, conforme for o caso. A imagem abaixo ilustra o caso
 da entrada do valor 5 para a coluna da matriz, demonstrando os elementos
 que deverão ser considerados na operação.

Entrada
A primeira linha de entrada contem um número C (0 ≤ C ≤ 11) indicando a
coluna que será considerada para operação. A segunda linha de entrada
contém um único caractere Maiúsculo T ('S' ou 'M'), indicando a operação
(Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem
os 144 valores de ponto flutuante que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto
decimal. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1182 {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

        double[][] matriz = new double[12][12];

        int coluna = scan.nextInt();
        char T = scan.next().charAt(0);
        double num;

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                num = scan.nextDouble();
                matriz[i][j] = num;
            }
        }

        double sum = 0;

        for (int i=0; i<matriz.length; i++) {
            sum += matriz[i][coluna];
        }

        if (T == 'S') {
            System.out.printf("%.1f%n", sum);
        }
        else {
            double media = sum / 12;
            System.out.printf("%.1f%n", media);
        }

        scan.close();
    }
}