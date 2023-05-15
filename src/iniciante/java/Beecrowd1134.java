package iniciante.java;

/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a
preferência de seus clientes. Escreva um algoritmo para ler o tipo de
combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa
de 1 a 4) deve ser solicitado um novo código (até que seja válido).
O programa será encerrado quando o código informado for o número 4.

Entrada
A entrada contém apenas valores inteiros e positivos.

Saída
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes
que abasteceram cada tipo de combustível, conforme exemplo. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1134 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int num;
        boolean continua = true;

        while (continua) {

            do {
                num = scan.nextInt();
            } while (num <= 0 || num >= 5);


            switch (num) {
                case 1: alcool++; break;
                case 2: gasolina++; break;
                case 3: diesel++; break;
                case 4: continua = false; break;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        scan.close();
    }
}