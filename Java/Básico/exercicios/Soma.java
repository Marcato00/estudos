import java.util.Scanner;

public class Soma {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num1 = scan.nextInt();

        System.out.println("Digite outro valor: ");
        int num2 = scan.nextInt();


        int soma = num1 + num2;

        System.out.println("A soma de ambos números é " + soma);
    }
}
