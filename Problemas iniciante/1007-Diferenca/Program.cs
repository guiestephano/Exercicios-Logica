using System;

class Program
{
    static void Main(string[] args)
    {
        int[] valores = new int[4];

        for(int i = 0; i < valores.Length; i++)
        {
            valores[i] = int.Parse(Console.ReadLine());
        }

        int diferenca = (valores[0] * valores[1] - valores[2] * valores[3]);

        Console.WriteLine($"DIFERENCA = {diferenca}");
    }
}