using System;

/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis 
 * (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 
 * 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas 
 * necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo
necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de
linha após cada linha, caso contrário seu programa apresentará a mensagem:
“Presentation Error”.*/

namespace Beecrowd1018;
class Beecrowd1018
{
    static void Main(string[] args)
    {

        int valorInicial = int.Parse(Console.ReadLine());

        int valor = valorInicial;
        int cem = valor / 100;
        valor %=  100;
        int cinquenta = valor / 50;
        valor %= 50;
        int vinte = valor / 20;
        valor %= 20;
        int dez = valor / 10;
        valor %= 10;
        int cinco = valor / 5;
        valor %= 5;
        int dois = valor / 2;
        int um = valor % 2;

        Console.WriteLine(valorInicial);
        Console.WriteLine($"{cem} nota(s) de R$ 100,00");
        Console.WriteLine($"{cinquenta} nota(s) de R$ 50,00");
        Console.WriteLine($"{vinte} nota(s) de R$ 20,00");
        Console.WriteLine($"{dez} nota(s) de R$ 10,00");
        Console.WriteLine($"{cinco} nota(s) de R$ 5,00");
        Console.WriteLine($"{dois} nota(s) de R$ 2,00");
        Console.WriteLine($"{um} nota(s) de R$ 1,00");
    }
}

