import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n, nd;

        System.out.println("Quantos lados tem o polígono?");
        n = sc.nextDouble();

        nd = n * (n - 3) / 2;

        System.out.println("Número de diagonais diferentes é " + nd);

        sc.close();
    }
}