import java.util.Scanner;

public class Farenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite em graus Farenheit: ");
        double farenheit = scan.nextDouble();

        double conversaoCelsius = (farenheit - 32) / 1.8;

        System.out.println("Convertendo para Celsius fica " + conversaoCelsius + "C");
    }
}
