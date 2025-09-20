import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite em graus Celsius: ");
        double celsius = scan.nextDouble();

        double conversaoFarenheit = (celsius * 1.8) + 32;

        System.out.println("Convertendo para Celsius fica " + conversaoFarenheit + "F");
    }
}
