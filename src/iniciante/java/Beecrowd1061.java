package iniciante.java;

/*Pedrinho está organizando um evento em sua Universidade.
O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês.
O problema é que Pedrinho quer calcular o tempo que o evento vai durar,
uma vez que ele sabe quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar
Pedrinho a calcular a duração deste evento.

Entrada
Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e
o dia do mês no qual o evento vai começar. Na linha seguinte, será informado
o momento no qual o evento vai iniciar, no formato hh : mm : ss.
Na terceira e quarta linha de entrada haverá outra informação no mesmo
formato das duas primeiras linhas, indicando o término do evento.

Saída
Na saída, deve ser apresentada a duração do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.*/

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1061 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        int W1 = scan.nextInt();
        int X1 = scan.nextInt();
        s = scan.next();
        int Y1 = scan.nextInt();
        s = scan.next();
        int Z1 = scan.nextInt();
        s = scan.next();
        int W2 = scan.nextInt();
        int X2 = scan.nextInt();
        s = scan.next();
        int Y2 = scan.nextInt();
        s = scan.next();
        int Z2 = scan.nextInt();
        int inicio = W1 * 24 * 60 * 60 + X1 * 60 * 60 + Y1 * 60 + Z1;
        int fim = W2 * 24 * 60 * 60 + X2 * 60 * 60 + Y2 * 60 + Z2;
        int duracao = fim - inicio;
        int W = duracao / 86400;
        int resto = duracao % 86400;
        int X = resto / 3600;
        resto %= 3600;
        int Y = resto / 60;
        int Z = resto % 60;

        System.out.println(W + " dia(s)");
        System.out.println(X + " hora(s)");
        System.out.println(Y + " minuto(s)");
        System.out.println(Z + " segundo(s)");
        scan.close();
    }
}
