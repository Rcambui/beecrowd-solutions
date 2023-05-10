package iniciante.java;

/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis
(cédulas) no qual o valor pode ser decomposto. As notas consideradas são de
100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas
necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo
necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de
linha após cada linha, caso contrário seu programa apresentará a mensagem:
“Presentation Error”. */

import java.io.IOException;
import java.util.Scanner;
public class Beecrowd1018 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int valor = scan.nextInt();

        int valorAtual = valor;
        int nota100 = valorAtual / 100;
        valorAtual -= nota100 * 100;
        int nota50 = valorAtual / 50;
        valorAtual -= nota50 * 50;
        int nota20 = valorAtual / 20;
        valorAtual -= nota20 * 20;
        int nota10 = valorAtual / 10;
        valorAtual -= nota10 * 10;
        int nota5 = valorAtual / 5;
        valorAtual -= nota5 * 5;
        int nota2 = valorAtual / 2;
        valorAtual -= nota2 * 2;
        int nota1 = valorAtual;

        System.out.println(valor);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");


        scan.close();
    }
}
