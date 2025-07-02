import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // Inicialização dos dados
        System.out.println("*".repeat(40));
        System.out.println("Dados iniciais do cliente:\n");
        System.out.print("Nome:          ");
        String nome = leitura.nextLine();
        System.out.print("Tipo conta:    ");
        String tipoConta = leitura.nextLine();
        System.out.print("Saldo inicial: ");
        Double saldo = leitura.nextDouble();
        System.out.printf("*".repeat(40));
        System.out.println("\n");

        // Menu de operações
        int opcao = 0;
        double valorRecebido = 0;
        double valorRetirado =0;
        while (opcao != 4) {
            System.out.println("""
                    
                    Operações
                    
                    1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    
                    Digite a opçao desejada:
                    """);
            opcao = leitura.nextInt();

            // Opção 1 - Consultar saldo
            if (opcao == 1) {
                System.out.println(String.format("O saldo é R$ %.2f", saldo));
            }

            // Opção 2 - Receber valor
            if (opcao == 2) {
                System.out.println("Informe o valor a receber: ");
                valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
                System.out.println(String.format("Saldo atualizado: R$ %.2f", saldo));
            }

            // Opção 3 - Transferir valor
            if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                valorRetirado = leitura.nextDouble();

                if (saldo < valorRetirado) {
                    System.out.println("Não há saldo suficiente para fazer essa transferência.");
                } else {
                    saldo -= valorRetirado;
                    System.out.println(String.format("Saldo atualizado: R$ %.2f", saldo));
                }
            }

            // Opcão 4 - sair
            if (opcao == 4) {
                System.out.println("Obrigado e volte sempre!");
            }

            // Caso não seja escolhido nenhuma opção
            if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {
                System.out.println("Digite uma opção válida!");
            }
        }
    }
}
