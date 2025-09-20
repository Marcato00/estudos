import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        double pesoIdeal = (altura * 100) - 100;

        System.out.println("Seu peso ideal seria: " + pesoIdeal + "KG");
    }
}
