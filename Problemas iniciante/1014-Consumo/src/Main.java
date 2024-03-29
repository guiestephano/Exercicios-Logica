import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int quilometros;
        double gasolinaGasta;
        double consumoMedio;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        quilometros = sc.nextInt();
        gasolinaGasta = sc.nextDouble();

        consumoMedio = quilometros / gasolinaGasta;

        System.out.println(String.format("%.3f", consumoMedio) + " km/l");

        sc.close();
    }
}
