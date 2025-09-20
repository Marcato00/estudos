public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean infoValidas = false;

        do {
            System.out.println("Entre com o nome de usuário: ");
            String nomeUser = new.next();

            System.out.println("Entre com a senha: ");
            String senha = new.next();

            if (nomeUser.equalsIgnoreCase(senha)) {
                //infoValidas = false;
                System.out.println("Senha igual ao usuário, digite uma nova senha.");
            } else{
                infoValidas = true;
                System.out.println("Usuário e senha válidos.");
            }

        } while(!infoValidas);
    }
}