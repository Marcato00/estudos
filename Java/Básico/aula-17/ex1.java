public class ex1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

        do {
            System.out.println("Entre com a primeira nota: ");
            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10){
                notaValida = true
                System.out.println("Você tirou: " + nota);
            } else {
                //notaValida = false;
                System.out.println("Só existe nota dentro de 0 a 10.");
            }
        } while(!notaValida);
    }
}