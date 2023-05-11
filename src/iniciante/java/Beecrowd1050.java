package iniciante.java;

/*Leia um número inteiro que representa um código de DDD para discagem interurbana.
Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:

Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
DDD nao cadastrado

Entrada
A entrada consiste de um único valor inteiro.

Saída
Imprima o nome da cidade correspondente ao DDD existente na entrada.
Imprima DDD nao cadastrado caso não existir DDD correspondente ao número digitado.*/

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1050 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int DDD = scan.nextInt();
        String destino;

        switch (DDD) {
            case 11:
                destino = "Sao Paulo";
                break;
            case 19:
                destino = "Campinas";
                break;
            case 21:
                destino = "Rio de Janeiro";
                break;
            case 27:
                destino = "Vitoria";
                break;
            case 31:
                destino = "Belo Horizonte";
                break;
            case 32:
                destino = "Juiz de Fora";
                break;
            case 61:
                destino = "Brasilia";
                break;
            case 71:
                destino = "Salvador";
                break;
            default:
                destino = "DDD nao cadastrado";
        }

        System.out.println(destino);
        scan.close();
    }
}
