using System;

/*Você deve fazer um programa que leia um valor qualquer e apresente uma 
 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], 
 * (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum 
 * destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

Entrada
O arquivo de entrada contém um número com ponto flutuante qualquer.

Saída
A saída deve ser uma mensagem conforme exemplo abaixo.*/

namespace Beecrowd1037;
class Beecrowd1037
{
    static void Main(string[] args)
    {
        double num = double.Parse(Console.ReadLine());
   

        if (num >= 0 && num <= 25)
        {
            Console.WriteLine("Intervalo [0,25]");
        }
        else if (num > 25 && num <= 50) {
            Console.WriteLine("Intervalo (25,50]");
        }
        else if (num > 50 && num <= 75)
        {
            Console.WriteLine("Intervalo (50,75]"); 
        }
        else if (num > 75 && num <= 100)
        {
            Console.WriteLine("Intervalo (75,100]"); 
        }
        else
        {
            Console.WriteLine("Fora de intervalo");
        }

        
    }
}

