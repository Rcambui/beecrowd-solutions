using System;

/*Escreva um programa que leia três valores com ponto flutuante de dupla 
 * precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a
uma das áreas descritas acima, sempre com mensagem correspondente e um espaço
entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3
dígitos após o ponto decimal.*/

namespace Beecrowd1012;
class Beecrowd1012
{
    static void Main(string[] args)
    {
        string[] line = Console.ReadLine().Split(' ');
        double a = double.Parse(line[0]);
        double b = double.Parse(line[1]);
        double c = double.Parse(line[2]);

        double triangulo = a * c / 2.0;
        double circulo = 3.14159 * (c * c);
        double trapezio = ((a + b) * c) / 2.0;
        double quadrado = b * b;
        double retangulo = a * b;

        Console.WriteLine("TRIANGULO: {0:F3}", triangulo);
        Console.WriteLine("CIRCULO: {0:F3}", circulo);
        Console.WriteLine("TRAPEZIO: {0:F3}", trapezio);
        Console.WriteLine("QUADRADO: {0:F3}", quadrado);
        Console.WriteLine("RETANGULO: {0:F3}", retangulo);
    }
}


