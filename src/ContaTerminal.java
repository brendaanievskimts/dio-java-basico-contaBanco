import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println(" ===== BANCO ====");

        System.out.println("Olá, digite [1] para criar uma nova conta ou [0] para finalizar a operação.");
        int opcao = in.nextInt();

        if(opcao == 1 ) {
            System.out.print("Informe o número da conta: ");
            int numero = in.nextInt();
            in.nextLine();

            System.out.print("Informe a agência: ");
            String agencia = in.nextLine();

            System.out.print("Informe seu o nome: ");
            String nomeCliente = in.nextLine();

            System.out.print("Informe o valor do saldo: ");
            double saldo = in.nextDouble();

            System.out.println(STR."Olá \{nomeCliente}, obrigado por criar uma conta em nosso banco, sua agência é \{agencia}, conta \{numero} e seu saldo \{saldo} já está disponível para saque");
        } else if (opcao == 0) {
            System.out.println("Finalizando operação...");
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
