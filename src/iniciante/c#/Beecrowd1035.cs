using System;

/*Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D 
 * for maior do que A, e a soma de C com D for maior que a soma de A e B e se C 
 * e D, ambos, forem positivos e se a variável A for par escrever a mensagem 
 * "Valores aceitos", senão escrever "Valores nao aceitos".

Entrada
Quatro números inteiros A, B, C e D.

Saída
Mostre a respectiva mensagem após a validação dos valores.*/

namespace Beecrowd1035;
class Beecrowd1035
{
    static void Main(string[] args)
    {
        string[] linha = Console.ReadLine().Split(' ');
        int A = int.Parse(linha[0]);
        int B = int.Parse(linha[1]);
        int C = int.Parse(linha[2]);
        int D = int.Parse(linha[3]);

        if ((B > C) && (D > A) && ((C + D) > (A + B)) && (C >= 0) && (D >= 0)
            && (A % 2 == 0))
        {
            Console.WriteLine("Valores aceitos");       
        }
        else {
            Console.WriteLine("Valores nao aceitos");
        }


        
    }
}

