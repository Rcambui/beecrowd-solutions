package iniciante.java;

/*Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo.
Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como
altura, mostrando a mensagem

Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1043 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        if ((A + B > C) && (A + C > B) && (B + C > A)) {
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        }
        else {
            double area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f%n", area);
        }

        scan.close();
    }
}