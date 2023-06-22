using System;

/*Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um 
 * aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, 
 * a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 
 * 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão
(double).

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1
dígito após o ponto decimal e com um espaço em branco antes e depois da
igualdade. Assim como todos os problemas, não esqueça de imprimir o fim de linha
após o resultado, caso contrário, você receberá "Presentation Error".*/

namespace Beecrowd1006;
class Beecrowd1006
{
    static void Main(string[] args)
    {

        double notaA = double.Parse(Console.ReadLine());
        double notaB = double.Parse(Console.ReadLine());
        double notaC = double.Parse(Console.ReadLine());

        double media = ((notaA * 2.0) + (notaB * 3.0) + (notaC * 5.0)) / 10.0;
        Console.WriteLine("MEDIA = {0:F1}", media);
    }
}

