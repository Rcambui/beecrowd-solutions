using System;

/*Faça um programa que leia três valores e apresente o maior dos três valores 
 * lidos seguido da mensagem “eh o maior”. Utilize a fórmula:



Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um
segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".*/

namespace Beecrowd1013;
class Beecrowd1013
{
    static void Main(string[] args)
    {
        string[] line = Console.ReadLine().Split(' ');
        int a = int.Parse(line[0]);
        int b = int.Parse(line[1]);
        int c = int.Parse(line[2]);

        int m = (a + b + Math.Abs(a - b)) / 2;
        int mFinal = (m + c + Math.Abs(m - c)) / 2;


        Console.WriteLine($"{mFinal} eh o maior");
    }
}

