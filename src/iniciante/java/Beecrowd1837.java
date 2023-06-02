package iniciante.java;

/*Começou a 4ạ Maratona de Programação da UFFS! Esperamos que você aproveite as
próximas horas que passará conosco e que se divirta muito! Boa sorte!

Este é o 3ọ ano do Clube de Programação, projeto de extensão que visa em primeiro
lugar tornar os programadores da região brasileira conhecida como Fronteira Sul muito mais
aptos a enfrentar os desafios computacionais tanto da academia quanto do mercado do trabalho.
Nossa principal estratégia está em promover oficinas e treinos para competições de Programação,
não apenas para estudantes da UFFS, mas para quem quiser participar. Apesar das várias dificuldades,
estamos muito felizes com os resultados que temos conquistado. Em parceria com a UNOCHAPECÓ,
a URI e a UNOESC, colaboramos para fazer de Chapecó nos dois últimos anos a 2ª maior sede do
Brasil na etapa regional da Maratona de Programação, o que é mais um indicador do entusiasmo
que o povo daqui tem por Programação.

Para aquecer você para esta competição, vamos pedir que você desenvolva um programa
que calcule o quociente e o resto da divisão de dois números inteiros, pode ser?
Lembre que o quociente e o resto da divisão de um inteiro a por um inteiro não-nulo
b são respectivamente os únicos inteiros q e r tais que 0 ≤ r < |b| e:

a = b × q + r

Caso você não saiba, o teorema que garante a existência e a unicidade dos inteiros q e r
é conhecido como ‘Teorema da Divisão Euclidiana’ ou ‘Algoritmo da Divisão’.

Entrada
A entrada é composta por dois números inteiros a e b (-1.000 ≤ a, b < 1.000).

Saída
Imprima o quociente q seguido pelo resto r da divisão de a por b.

*/

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1837 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int q, r;
        if (a >= 0) {
            q = a / b;
            r = a % b;
        } else {
            int x = 0, y = 0;

            if (b < 0) x = b * -1;
            else x = b;

            for (r = 0; r < x; r++) {
                y = a - r;
                if (y % b == 0) break;
            }
            q = y / b;
        }

        System.out.println(q + " " + r);

        scan.close();
    }
}
