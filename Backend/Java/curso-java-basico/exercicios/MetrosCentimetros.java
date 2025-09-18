import java.util.Scanner;

public class MetrosCentimetros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        
        float metros = scan.nextFloat();


        float conversao = metros * 100;

        System.out.println("O valor em centímetros é " + conversao + "cm");
    }
}
