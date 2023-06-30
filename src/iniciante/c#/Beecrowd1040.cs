using System;
using System.Globalization;

/*Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, 
 * correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 3, 
 * 4 e 1, respectivamente, para cada uma destas notas e mostre esta média 
 * acompanhada pela mensagem "Media: ". Se esta média for maior ou igual a 7.0, 
 * imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0, 
 * imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor entre 
 * 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

No caso do aluno estar em exame, leia um valor correspondente à nota do exame
obtida pelo aluno. Imprima então a mensagem "Nota do exame: " acompanhada pela
nota digitada. Recalcule a média (some a pontuação do exame com a média
anteriormente calculada e divida por 2). e imprima a mensagem "Aluno aprovado."
(caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média
tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado após
ter pego exame) apresente na última linha uma mensagem "Media final: " seguido
da média final para esse aluno.

Entrada
A entrada contém quatro números de ponto flutuante correspendentes as notas dos
alunos.

Saída
Todas as respostas devem ser apresentadas com uma casa decimal. As mensagens
devem ser impressas conforme a descrição do problema. Não esqueça de imprimir
o enter após o final de cada linha, caso contrário obterá "Presentation Error".*/

namespace Beecrowd1040;
class Beecrowd1040
{
    static void Main(string[] args)
    {
        float n1, n2, n3, n4, media, exame;

        string[] s = Console.ReadLine().Split(' ');

        n1 = float.Parse(s[0], CultureInfo.InvariantCulture);
        n2 = float.Parse(s[1], CultureInfo.InvariantCulture);
        n3 = float.Parse(s[2], CultureInfo.InvariantCulture);
        n4 = float.Parse(s[3], CultureInfo.InvariantCulture);

        media = ((n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / (2 + 3 + 4 + 1));


        if (media >= 7.0)
        {

            Console.WriteLine("Media: " + media.ToString("F1", CultureInfo.InvariantCulture));
            Console.WriteLine("Aluno aprovado.");

        }
        else
        {
            if (media < 5.0)
            {

                Console.WriteLine("Media: {0:f1}", (media - 0.01).ToString("F1", CultureInfo.InvariantCulture));

                Console.WriteLine("Aluno reprovado.");

            }
            else
            {

                Console.WriteLine("Media: {0:f1}", (media - 0.01).ToString("F1", CultureInfo.InvariantCulture));
                Console.WriteLine("Aluno em exame.");
                exame = float.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
                Console.WriteLine("Nota do exame: " + exame.ToString("F1", CultureInfo.InvariantCulture));
                media = (media + exame) / 2;

                if (media >= 5.0)
                {

                    Console.WriteLine("Aluno aprovado.");

                }
                else
                {

                    Console.WriteLine("Aluno reprovado.");

                }

                Console.WriteLine("Media final: " + media.ToString("F1", CultureInfo.InvariantCulture));

            }
        }
    }
}

