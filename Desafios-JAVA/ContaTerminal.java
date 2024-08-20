import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 100.00; // Saldo inicial
        int opcao;

        do {
            System.out.println("Bem-vindo ao Caixa Eletrônico");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é: R$ " + saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado com sucesso! Novo saldo: R$ " + saldo);
                    break;

                case 3:
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso! Novo saldo: R$ " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 4:
                    System.out.println("Obrigado por usar o Caixa Eletrônico.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println();

        } while (opcao != 4);

        scanner.close();
    }
}
