import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu ganho diário: ");
        double ganhoDiario = scan.nextDouble();

        System.out.println("Digite quantos dias trabalhados no mês: ");
        int diasTrabalhados = scan.nextInt();

        double salario = ganhoDiario * diasTrabalhados;

        System.out.println("O salário desse mês é " + salario + "reais.");
    }
}
