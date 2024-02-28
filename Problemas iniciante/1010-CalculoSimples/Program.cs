using System;
using System.Globalization;

class Program
{
    static void Main(string[] args)
    {
        Pedido[] pedidos = new Pedido[2];
        double total = 0;
        for(int i = 0; i < 2; i++)
        {
            string[] vet = Console.ReadLine().Split(' ');
            int numero = int.Parse(vet[0]);
            int quantidade = int.Parse(vet[1]);
            double valorUnitario = double.Parse(vet[2],CultureInfo.InvariantCulture);

            pedidos[i] = new Pedido(numero, quantidade, valorUnitario);
            total += pedidos[i].Total();
        }

        Console.WriteLine($"VALOR A PAGAR: R$ {total.ToString("F2",CultureInfo.InvariantCulture)}");
    }
}

class Pedido{
    public int Numero { get; private set; }
    public int Quantidade { get; private set; }
    public double ValorUnitario { get; private set; }

    public Pedido(int numero, int quantidade, double valorUnitario)
    {
        Numero = numero;
        Quantidade = quantidade;
        ValorUnitario = valorUnitario;
    }

    public double Total()
    {
        return ValorUnitario * Quantidade;
    }
}