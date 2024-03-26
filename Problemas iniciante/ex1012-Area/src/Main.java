import entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        formas.add(new TrianguloRetangulo(a,c));
        formas.add(new Circulo(c));
        formas.add(new Trapezio(a,b,c));
        formas.add(new Quadrado(b));
        formas.add(new Retangulo(a,b));

        for(Forma forma : formas){
            System.out.println(forma.getTipo() + ": " + String.format("%.3f",forma.calcularArea()));
        }

        sc.close();
    }
}
