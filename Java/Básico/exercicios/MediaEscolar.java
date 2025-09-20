import java.util.Scanner;

public class MediaEscolar {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Primeira média: ");
        float media1 = scan.nextFloat();

        System.out.println("Segunda média: ");
        float media2 = scan.nextFloat();

        System.out.println("Terceira média: ");
        float media3 = scan.nextFloat();

        System.out.println("Quarta média: ");
        float media4 = scan.nextFloat();

        
        float media = (media1 + media2 + media3 + media4) / 2;
        System.out.println("A média final do aluno é " + media);
    }
}
