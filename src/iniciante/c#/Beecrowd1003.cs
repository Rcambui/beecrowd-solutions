﻿using System;

/*Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a 
 * soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta 
 * variável.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em
branco antes e depois da igualdade seguido pelo valor correspondente à soma de
A e B. Como todos os problemas, não esqueça de imprimir o fim de linha após o
resultado, caso contrário, você receberá "Presentation Error".*/

namespace Beecrowd1003;
class Beecrowd1003
{
    static void Main(string[] args)
    {
        int A = int.Parse(Console.ReadLine());
        int B = int.Parse(Console.ReadLine());

        int soma = A + B;
        Console.WriteLine($"SOMA = {soma}");
    }
}

