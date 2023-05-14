package iniciante.java;

/*A Federação Gaúcha de Futebol contratou você para escrever um programa
para fazer uma estatística do resultado de vários GRENAIS. Escreva um
programa para ler o número de gols marcados pelo Inter e pelo Grêmio em um
GRENAL. Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e
solicitar uma resposta. Se a resposta for 1, o algoritmo deve ser executado
novamente solicitando o número de gols marcados pelos times em uma nova
partida, caso contrário deve ser encerrado imprimindo:

- Quantos GRENAIS fizeram parte da estatística.
- O número de vitórias do Inter.
- O número de vitórias do Grêmio.
- O número de Empates.
- Uma mensagem indicando qual o time que venceu o maior número de GRENAIS
(ou "Nao houve vencedor", caso termine empatado).

Entrada
O arquivo de entrada contém 2 valores inteiros, correspondentes aos gols
marcados pelo Inter e pelo Grêmio respectivamente. Em seguida háverá um
inteiro (1 ou 2), correspondente à repetição do programa.

Saída
Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal
(1-sim 2-nao)". Quando o algoritmo for encerrado devem ser mostradas as
estatísticas conforme a descrição apresentada acima. Obs: a palavra
"Gremio" deve ser impressa sem acento, conforme o exemplo abaixo. */

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1131 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int continua = 1;
        int gremio = 0, inter = 0, empate = 0;
        int G, I;

        do {
            I = scan.nextInt();
            G = scan.nextInt();

            if (I == G) { empate++; }
            else if (I > G) { inter++; }
            else { gremio++; }

            System.out.println("Novo grenal (1-sim 2-nao)");
            continua = scan.nextInt();

        } while (continua == 1);

        int grenais = inter + gremio + empate;

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + empate);

        if (inter == gremio) { System.out.println("Nao houve vencedor"); }
        else if (inter > gremio) { System.out.println("Inter venceu mais");}
        else {System.out.println("Gremio venceu mais");}

        scan.close();
    }
}