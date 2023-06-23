using System;

/*Escreva um programa que leia o número de um funcionário, seu número de horas 
 * trabalhadas, o valor que recebe por hora e calcula o salário desse 
 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas 
 * casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas
decimais, representando o número, quantidade de horas trabalhadas e o valor que
o funcionário recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um
espaço em branco antes e depois da igualdade. No caso do salário, também deve
haver um espaço em branco após o $.*/

namespace Beecrowd1008;
class Beecrowd1008
{
    static void Main(string[] args)
    {
        int number = int.Parse(Console.ReadLine());
        int hours = int.Parse(Console.ReadLine());
        double amountPerHour = double.Parse(Console.ReadLine());

        double salary = hours * amountPerHour;
        Console.WriteLine($"NUMBER = {number}");
        Console.WriteLine("SALARY = U$ {0:F2}", salary);
    }
}

