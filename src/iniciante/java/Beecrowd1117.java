package iniciante.java;

/*Faça um programa que leia as notas referentes às duas avaliações de um
aluno. Calcule e imprima a média semestral. Faça com que o algoritmo só
aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]).
Cada nota deve ser validada separadamente.

Entrada
A entrada contém vários valores reais, positivos ou negativos. O programa
deve ser encerrado quando forem lidas duas notas válidas.

Saída
Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media
= " seguido do valor do cálculo. O valor deve ser apresentado com duas
casas após o ponto decimal. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1117 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int cont = 0;
        double nota;
        double soma = 0;

        while (cont < 2) {
            nota = scan.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("nota invalida");
            }
            else {
                soma += nota;
                cont++;
            }
        }

        double media = soma / 2.0;
        System.out.printf("media = %.2f%n", media);

        scan.close();
    }
}