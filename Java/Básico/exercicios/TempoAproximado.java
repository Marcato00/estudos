import java.util.Scanner;

public class TempoAproximado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo (em MB): ");
        double tamanhoArquivo = scan.nextDouble();

        System.out.println("Digite a velocidade de download (em Mbps): ");
        double velocidadeDownload = scan.nextDouble();

        double tempoAproximado = tamanhoArquivo / velocidadeDownload;

        System.out.println("O tempo aproximado para finalizar o download é de " + tempoAproximado + "minutos.");
    }
}
