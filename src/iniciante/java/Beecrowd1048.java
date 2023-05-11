package iniciante.java;

/*A empresa ABC resolveu conceder um aumento de salários a seus funcionários de
acordo com a tabela abaixo:


Salário	Percentual de Reajuste
0 - 400.00
400.01 - 800.00
800.01 - 1200.00
1200.01 - 2000.00
Acima de 2000.00

15%
12%
10%
7%
4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor
de reajuste ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste
(ambos devem ser apresentados com 2 casas decimais) e o percentual de
reajuste ganho, conforme exemplo abaixo.*/

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1048 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double salario = scan.nextDouble();
        byte porcentagem;
        if (salario <= 400.0) {
            porcentagem = 15;
        } else if (salario <= 800.0) {
            porcentagem = 12;
        } else if (salario <= 1200.0) {
            porcentagem = 10;
        } else if (salario <= 2000.0) {
            porcentagem = 7;
        } else {
            porcentagem = 4;
        }

        double reajuste = salario * ((double)porcentagem / 100.0);
        double novoSalario = salario + reajuste;
        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.println("Em percentual: " + porcentagem + " %");
        scan.close();
    }
}
