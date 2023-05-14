package iniciante.java;

/*Escreva um programa que repita a leitura de uma senha até que ela seja
válida. Para cada leitura de senha incorreta informada, escrever a
mensagem "Senha Invalida". Quando a senha for informada corretamente
deve ser impressa a mensagem "Acesso Permitido" e o
algoritmo encerrado. Considere que a senha correta é o valor 2002.

Entrada
A entrada é composta por vários casos de testes contendo valores
inteiros.

Saída
Para cada valor lido mostre a mensagem correspondente à descrição do
problema. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1114 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int senha;

        do {
            senha = scan.nextInt();

            if (senha == 2002) {
                System.out.println("Acesso Permitido");
                break;
            }

            System.out.println("Senha Invalida");

        } while (true);

        scan.close();
    }
}