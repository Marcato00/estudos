import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto recebe por hora: ");
        double ganhoHora = scan.nextDouble();

        System.out.println("Quantas horas trabalhadas no mês: ");
        double horasMes = scan.nextDouble();

        double salario = ganhoHora * horasMes;
        System.out.println("Seu ganho mensal é de " + salario + "reais.");

        //descontos
        double inss = (salario / 100) * 8;
        double sindicato = (salario / 100) * 5;
        double ir = (salario / 100) * 11;
        double descontos = inss + sindicato + ir;
        double salarioFinal = salario - descontos;

        System.out.println("O desconto do INSS é de  " + inss + "reais.");
        System.out.println("O desconto do sindicato é de " + sindicato + "reais.");
        System.out.println("O desconto do IR é de " + ir + "reais.");
        System.out.println("O total de descontos é de " + descontos + "reais.");

        System.out.println("O salário com os descontos é " + salarioFinal + "reais.");

    }
}
