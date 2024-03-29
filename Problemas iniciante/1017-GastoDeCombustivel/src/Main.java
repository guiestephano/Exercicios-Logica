import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int quilometrosPorLitro = 12;
        int tempo, velocidadeMedia;
        Scanner sc = new Scanner(System.in);
        tempo = sc.nextInt();
        velocidadeMedia = sc.nextInt();
        int mediaTotal = tempo * velocidadeMedia;
        double consumo = (double)mediaTotal / quilometrosPorLitro;

        System.out.println(String.format("%.3f", consumo));
        sc.close();
    }
}
