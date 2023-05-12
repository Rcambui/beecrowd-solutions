package iniciante.java;

/*Leia um valor inteiro N. Este valor será a quantidade de valores que serão
lidos em seguida. Para cada valor lido, mostre uma mensagem em inglês
dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE)
ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora a
descrição correta seja (EVEN NULL), pois por definição zero é par, seu
programa deverá imprimir apenas NULL.

Entrada
A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica
o número de casos de teste. Cada caso de teste a seguir é um valor inteiro
X (-107 < X <107).

Saída
Para cada caso, imprima uma mensagem correspondente, de acordo com o
exemplo abaixo. Todas as letras deverão ser maiúsculas e sempre deverá
haver um espaço entre duas palavras impressas na mesma linha. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1074 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int quantidade = scan.nextInt();
        int num;

        for (int i=0; i<quantidade; i++) {
            num = scan.nextInt();

            if (num == 0) {
                System.out.println("NULL");
            }
            else if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("EVEN POSITIVE");
                }
                else {
                    System.out.println("ODD POSITIVE");
                }
            }
            else {
                if (num % 2 == 0) {
                    System.out.println("EVEN NEGATIVE");
                }
                else {
                    System.out.println("ODD NEGATIVE");
                }
            }
        }


        scan.close();
    }
}