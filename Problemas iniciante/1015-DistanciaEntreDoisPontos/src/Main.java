import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args){
    
       double x1, x2, y1, y2, distancia;
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       x1 = sc.nextDouble();
       y1 = sc.nextDouble();
       
       x2 = sc.nextDouble();
       y2 = sc.nextDouble();
       
       distancia = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
       
       System.out.println(String.format("%.4f",distancia));
       
       sc.close();
 
    }
 
}
