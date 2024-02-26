using System;
using System.Globalization;

class Program
{
    static void Main(string[] args)
    {
        double pi = 3.14159;
        for(int i=0; i < 3; i++)
        {
            double raio = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
            double area = pi * Math.Pow(raio, 2);
            Console.WriteLine(area.ToString("F4", CultureInfo.InvariantCulture));
        }
    }
}