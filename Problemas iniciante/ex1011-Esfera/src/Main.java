import java.util.Locale;
import java.util.Scanner;

public class Main {
    static final double PI = 3.14159;

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double volume = (4.0/3.0) * PI * Math.pow(raio,3);
        System.out.println("VOLUME = " + String.format("%.3f",volume));
        sc.close();
    }
}
