public class ex3{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.println("Digite seu nome: ");

            nome = scan.next();

            if (nome.lenght() > 3){
                infoValida = true;
            } else{
                System.out.println("Nome precisa ter no mínimo 3 caracteres");
            }
        } while(!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite sua idade: ");

            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150){
                infoValida = true;
            } else{
                System.out.println("Idade precisa ser entre 0 e 150.");
            }
        } while(!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite seu salário: ");

            salario = scan.nextDouble();

            if (salario > 0){
                infoValida = true;
            } else{
                System.out.println("Salário precisa ser maior que 0.");
            }
        } while(!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite seu sexo (masculino ou feminino): ");

            sexo = scan.next();

            if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("feminino")){
                infoValida = true;
            } else{
                System.out.println("Sexo precisa ser 'masculino' ou 'feminino'");
            }
        } while(!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite seu estado civil (solteiro, casado, viúvo ou divorciado): ");

            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("solteiro") || estadoCivil.equalsIgnoreCase("casado") || estadoCivil.equalsIgnoreCase("viúvo") || estadoCivil.equalsIgnoreCase("divorciado")){
                infoValida = true;
            } else{
                System.out.println("Estado Civil precisa ser 'solteiro', 'casado', 'viúvo' ou 'divorciado'.");
            }
        } while(!infoValida);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}