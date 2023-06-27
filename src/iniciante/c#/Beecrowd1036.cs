using System;

/*Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de 
 * Bhaskara. Se não for possível calcular as raízes, mostre a mensagem 
 * correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de 
 * numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem
"Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5
dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo.
Imprima sempre o final de linha após cada mensagem.*/

namespace Beecrowd1036;
class Beecrowd1036
{
    static void Main(string[] args)
    {
        string[] linha = Console.ReadLine().Split(' ');
        double A = double.Parse(linha[0]);
        double B = double.Parse(linha[1]);
        double C = double.Parse(linha[2]);

        if ((A == 0) | (B * B - 4 * A * C < 0))
        {
            Console.WriteLine("Impossivel calcular");
            return;
        }

        double bascara = Math.Sqrt((B * B) - 4 * A * C);
        double R1 = (-B + bascara) / (2 * A);
        double R2 = (-B - bascara) / (2 * A);
        Console.WriteLine("R1 = " + R1.ToString("F5"));
        Console.WriteLine("R2 = " + R2.ToString("F5"));

        
    }
}

