package iniciante.java;

/*Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram
pares, quantos valores digitados foram ímpares, quantos valores digitados
foram positivos e quantos valores digitados foram negativos.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha,
não esquecendo o final de linha após cada uma. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1066 {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;
        int num;

        for (int i=0; i<5; i++) {
            num = scan.nextInt();

            if (num % 2 == 0) {
                pares++;
            }
            else {
                impares++;
            }

            if (num > 0) {
                positivos++;
            }
            else {
                if (num != 0)
                    negativos++;
            }
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");



        scan.close();
    }
}