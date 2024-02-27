using System;
using System.Globalization;

class Program
{
    static void Main(string[] args)
    {
        double[] notas = new double[3];
        
        for(int i = 0; i < 3; i++)
        {
            notas[i] = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
        }

        double media = ((notas[0] * 2) + (notas[1] * 3) + (notas[2] * 5)) / 10;

        Console.WriteLine($"MEDIA = {media.ToString("F1",CultureInfo.InvariantCulture)}");
    }
}