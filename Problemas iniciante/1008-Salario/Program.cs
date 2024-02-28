using System;
using System.Globalization;

class Program
{
    static void Main(string[] args)
    {
        int numero = int.Parse(Console.ReadLine());
        int horas = int.Parse(Console.ReadLine());
        double valorHora = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture) ;

        Funcionario funcionario = new Funcionario(numero, horas, valorHora);
        Console.WriteLine(funcionario.ToString());
    }
}

class Funcionario
{
    public int Numero { get; private set; }
    public int HorasTrabalhadas { get; private set; }
    public double ValorHora { get; private set; } 
    public double Salario { get; private set; }

    public Funcionario(int numero, int horas, double valorHora)
    {
        Numero = numero;
        HorasTrabalhadas = horas;
        ValorHora = valorHora;
        Salario = horas * valorHora;
    }

    public override string ToString()
    {
        return $"NUMBER = {Numero}\nSALARY = U$ {Salario.ToString("F2", CultureInfo.InvariantCulture)}";
    }
}