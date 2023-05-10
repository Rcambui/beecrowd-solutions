package iniciante.java;

/*Leia 3 valores inteiros e ordene-os em ordem crescente.
No final, mostre os valores em ordem crescente, uma linha em
branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.*/

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1042 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int primeiro, segundo, terceiro;

        if (A > B && A > C) {
            primeiro = A;
            if (B > C) {
                segundo = B;
                terceiro = C;
            }
            else {
                segundo = C;
                terceiro = B;
            }
        }
        else if (B > C) {
            primeiro = B;
            if (A > C) {
                segundo = A;
                terceiro = C;
            }
            else {
                segundo = C;
                terceiro = A;
            }
        }
        else {
            primeiro = C;
            if (B > A) {
                segundo = B;
                terceiro = A;
            }
            else {
                segundo = A;
                terceiro = B;
            }
        }

        System.out.println(terceiro);
        System.out.println(segundo);
        System.out.println(primeiro);
        System.out.println();
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        scan.close();
    }
}