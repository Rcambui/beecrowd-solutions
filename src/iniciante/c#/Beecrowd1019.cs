using System;

/*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado 
 * evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para
horas:minutos:segundos, conforme exemplo fornecido.*/

namespace Beecrowd1019;
class Beecrowd1019
{
    static void Main(string[] args)
    {

        int duracao = int.Parse(Console.ReadLine());

        int horas = duracao / 3600;
        duracao %= 3600;
        int minutos = duracao / 60;
        int segundos = duracao % 60;

        Console.WriteLine($"{horas}:{minutos}:{segundos}");
    }
}

