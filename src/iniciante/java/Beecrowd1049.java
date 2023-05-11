package iniciante.java;

/*Neste problema, você deverá ler 3 palavras que definem o tipo de animal
possível segundo o esquema abaixo, da esquerda para a direita.  Em seguida
conclua qual dos animais seguintes foi escolhido, através das três palavras
fornecidas.

Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o
animal segundo a figura acima, com todas as letras minúsculas.

Saída
Imprima o nome do animal correspondente à entrada fornecida.*/

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1049 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String palavra1 = scan.next();
        String palavra2 = scan.next();
        String palavra3 = scan.next();
        String animal = "";

        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    animal = "aguia";
                } else {
                    animal = "pomba";
                }
            } else if (palavra3.equals("onivoro")) {
                animal = "homem";
            } else {
                animal = "vaca";
            }
        } else if (palavra2.equals("inseto")) {
            if (palavra3.equals("hematofago")) {
                animal = "pulga";
            } else {
                animal = "lagarta";
            }
        } else if (palavra3.equals("onivoro")) {
            animal = "minhoca";
        } else {
            animal = "sanguessuga";
        }

        System.out.println(animal);
        scan.close();
    }
}