package iniciante.java;

/*Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:
se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada.*/

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1045 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        double primeiro;
        double segundo;
        double terceiro;
        if (A > B && A > C) {
            primeiro = A;
            if (B > C) {
                segundo = B;
                terceiro = C;
            } else {
                segundo = C;
                terceiro = B;
            }
        } else if (B > C) {
            primeiro = B;
            if (A > C) {
                segundo = A;
                terceiro = C;
            } else {
                segundo = C;
                terceiro = A;
            }
        } else {
            primeiro = C;
            if (B > A) {
                segundo = B;
                terceiro = A;
            } else {
                segundo = A;
                terceiro = B;
            }
        }

        if (primeiro >= segundo + terceiro) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (primeiro * primeiro == segundo * segundo + terceiro * terceiro) {
                System.out.println("TRIANGULO RETANGULO");
            }

            if (primeiro * primeiro > segundo * segundo + terceiro * terceiro) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }

            if (primeiro * primeiro < segundo * segundo + terceiro * terceiro) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (primeiro == segundo && primeiro == terceiro) {
                System.out.println("TRIANGULO EQUILATERO");
            }

            if (primeiro == segundo && primeiro != terceiro || segundo == terceiro && segundo != primeiro || primeiro == terceiro && primeiro != segundo) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        scan.close();
    }
}
