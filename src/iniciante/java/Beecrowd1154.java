package iniciante.java;

/*Faça um algoritmo para ler um número indeterminado de dados, contendo
cada um, a idade de um indivíduo. O último dado, que não entrará nos
cálculos, contém o valor de idade negativa. Calcular e imprimir a idade
média deste grupo de indivíduos.

Entrada
A entrada contém um número indeterminado de inteiros. A entrada será
encerrada quando um valor negativo for lido.

Saída
A saída contém um valor correspondente à média de idade dos indivíduos.

A média deve ser impressa com dois dígitos após o ponto decimal. */


import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1154 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int idade = scan.nextInt();
        int num = 0;
        int soma = 0;

        while (idade > 0) {
            soma += idade;
            num++;
            idade = scan.nextInt();
        }

        double media = soma / (double) num;
        System.out.printf("%.2f%n", media);

        scan.close();
    }
}