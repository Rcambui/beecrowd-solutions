package iniciante.java;

/*Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?

Entrada
Não há nenhuma entrada neste problema.

Saída
A saída contém um valor correspondente ao valor de S.
O valor deve ser impresso com dois dígitos após o ponto decimal.*/

public class Beecrowd1156 {
    public static void main(String[] args) {

        double S = 1.0;
        double N = 3.0;
        double M = 2.0;

        while (N <= 39) {
            S += N/M;

            N += 2;
            M *= 2;
        }

        System.out.printf("%.2f%n", S);
    }
}