import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int valorTotal, restande;
        Locale.setDefault(new Locale("pt","BR"));
        Scanner sc = new Scanner(System.in);
        valorTotal = sc.nextInt();

        if(0 < valorTotal && valorTotal < 1000000){
            System.out.println(valorTotal);
            restande = valorTotal;
            for(int i = 100; i >= 1; i = i / 2){
                if(i == 25){
                    i = 20;
                }
                System.out.printf("%d nota(s) de R$ %.2f%n",(restande / i), (float)i);
                restande %= i;
            }
        }
        sc.close();
    }
}
