import java.util.Scanner;

public class ContaTerminal  {
    
    public static void main(String[] args) throws Exception {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número da conta: ");
            int numeroConta = scanner.nextInt();

            System.out.print("Digite a agência da conta: ");
            String agenciaConta = scanner.next();

            System.out.print("Digite o nome do titular da conta: ");
            String nomeTitular = scanner.next();

            System.out.print("Digite o saldo da conta: ");
            double saldoConta = scanner.nextDouble();

            System.out.println("Conta bancária criada com sucesso!");
            System.out.println("Número da conta: " + numeroConta);
            System.out.println("Agência da conta: " + agenciaConta);
            System.out.println("Nome do titulae da conta: " + nomeTitular);
            System.out.println("Saldo da conta: " + saldoConta);
        }

        //Conhecer e importar a classe Sacanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela Scanner os valores digitados pelo usuário

        //Exibir a mensagem conta criada
    }
}
