using System;
using System.Globalization;

class Program
{
    static void Main(string[] args)
    {
        double valorA = double.Parse(Console.ReadLine(),CultureInfo.InvariantCulture);
        double valorB = double.Parse(Console.ReadLine(),CultureInfo.InvariantCulture);

        double media = ((valorA * 3.5) + (valorB * 7.5)) / 11;

        Console.WriteLine($"MEDIA = {media.ToString("F5",CultureInfo.InvariantCulture)}");
    }
}