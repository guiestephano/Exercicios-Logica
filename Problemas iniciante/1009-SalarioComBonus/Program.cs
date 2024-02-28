using System;
using System.Globalization;

class Program
{
    static void Main(string[] args)
    {
        string nome = Console.ReadLine();
        double salarioFixo = double.Parse(Console.ReadLine(),CultureInfo.InvariantCulture);
        double totalVendadas = double.Parse(Console.ReadLine(),CultureInfo.InvariantCulture);

        Vendedor vendedor = new Vendedor(nome, salarioFixo, totalVendadas);

        Console.WriteLine(vendedor.ToString());
    }
}

class Vendedor
{
    public string Nome { get; private set; }
    public double SalarioFixo { get;private set; }
    public double TotalVendas { get;private set; }
    public double SalarioTotal { get;private set; }

    public Vendedor(string nome, double salarioFixo, double totalVendas)
    {
        Nome = nome;
        SalarioFixo = salarioFixo;
        TotalVendas = totalVendas;
        SalarioTotal = SalarioFixo + totalVendas * 0.15;
    }

    public override string ToString()
    {
        return $"TOTAL = R$ {SalarioTotal.ToString("F2",CultureInfo.InvariantCulture)}";
    }
}