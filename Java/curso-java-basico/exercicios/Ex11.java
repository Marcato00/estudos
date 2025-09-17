import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com outro número inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("Entre com outro número real: ");
        double num3 = scan.nextDouble();

        //a. O produto do dobro do primeiro com metade do segundo.
        int resultado1 = (num1 * 2) * (num2 /2);
        
        //b. A soma do triplo do primeiro com o terceiro.
        double resultado2 = (num1 * 3) + num3;

        //c. O terceiro elevado ao cubo.
        double resultado3 = Math.pow(num3, 3);

        //resultados
        System.out.println("Resposta A: " + resultado1);
        System.out.println("Resposta B: " + resultado2);
        System.out.println("Resposta C: " + resultado3);

    }
}
