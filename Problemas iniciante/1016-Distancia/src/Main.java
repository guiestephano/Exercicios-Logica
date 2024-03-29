import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int velocidadeCarroX = 60;
        int velocidadeCarroY = 90;
        Scanner sc = new Scanner(System.in);
        int distancia = sc.nextInt();
        if(velocidadeCarroX != velocidadeCarroY){
            float diferencaVelocidadesKm = Math.abs(velocidadeCarroY - velocidadeCarroX) / 60f;
            System.out.println((int)(distancia / diferencaVelocidadesKm) + " minutos");
        }
        else{
            System.out.println("os veiculos possuem a mesma velocidade.");
        }
        sc.close();
    }
}
