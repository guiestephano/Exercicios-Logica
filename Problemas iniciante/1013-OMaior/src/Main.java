import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int valorA, valorB, valorC, maiorValor;
        Scanner sc = new Scanner(System.in);
        valorA = sc.nextInt();
        valorB = sc.nextInt();
        valorC = sc.nextInt();

        maiorValor = maiorNumero(valorA, valorB);
        maiorValor = maiorNumero(maiorValor, valorC);

        System.out.println(maiorValor + " eh o maior");

        sc.close();
    }

    public static int maiorNumero(int primeiroValor, int segundoValor){
        return (primeiroValor + segundoValor + Math.abs(primeiroValor - segundoValor)) /2;
    }
}
