import java.math.BigDecimal;
import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner conta = new Scanner(System.in);


// --- INÍCIO DA CONFIGURAÇÃO DO SALDO INICIAL ---
        System.out.println("-------------------------------------------------------------");
        System.out.println("BEM-VINDO AO SISTEMA BANCÁRIO!");
        System.out.print("Por favor, digite o saldo inicial da conta: R$ ");

        // Captura o saldo inicial digitado pelo usuário
        BigDecimal saldo;

        try {
            saldo = conta.nextBigDecimal();
            if (saldo.compareTo(BigDecimal.ZERO) < 0) {
                saldo = BigDecimal.ZERO;
                System.out.println("⚠️ Saldo inicial não pode ser negativo. Iniciando com R$ 0.00");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("❌ Entrada inválida. Iniciando com R$ 0.00.");
            saldo = BigDecimal.ZERO;
            conta.next(); // Limpa o buffer de entrada
        }

        System.out.printf("✅ Saldo inicial configurado: R$ %.2f%n", saldo);
        System.out.println("-------------------------------------------------------------");
        // --- FIM DA CONFIGURAÇÃO DO SALDO INICIAL ---

        // Inicializamos a escolha com um valor diferente de 4 (Sair)
        int escolha = 0;

        // 1. O "Loop" While: O menu roda ENQUANTO a escolha não for 4
        while (escolha != 4) {

            //Apresentação do Menu
            System.out.println("\n*************************************************************");

            System.out.printf("Saldo Atual: R$ %.2f%n\n", saldo);

            System.out.println("Selecione a Opção desejada! ");
            System.out.println("1 - Consultar Saldo ");
            System.out.println("2 - Depósito Valor ");
            System.out.println("3 - Transferir Valor ");
            System.out.println("4 - Sair ");

            System.out.println("*************************************************************");

            escolha = conta.nextInt();
            switch (escolha) {
                case 1:
                    System.out.printf("✅ Seu saldo atual é de R$ %.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: R$ ");
                    BigDecimal valorDeposito = conta.nextBigDecimal();

                    if (valorDeposito.compareTo(BigDecimal.ZERO) > 0) {
                        saldo = saldo.add(valorDeposito);
                        System.out.printf("✅ Depósito de R$ %.2f realizado. Novo saldo: R$ %.2f%n", valorDeposito, saldo);
                    } else {
                        System.out.println("❌ Valor de depósito deve ser positivo.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor para saque/transferência: R$ ");
                BigDecimal valorSaque = conta.nextBigDecimal();

                if (saldo.compareTo(valorSaque) >= 0 && valorSaque.compareTo(BigDecimal.ZERO) > 0) {
                    saldo = saldo.subtract(valorSaque);
                    System.out.printf("✅ Saque de R$ %.2f realizado. Novo saldo: R$ %.2f%n", valorSaque, saldo);
                }else{
                    System.out.println("❌ Saldo insuficiente ou valor inválido para saque!");
                }
                    break;
                case 4:
                    // O break aqui sai do switch. O loop 'while' vê que 'escolha' é 4 e termina.
                    System.out.println("✅ Sistema encerrado com sucesso. Obrigado!");
                    break;
                default:
                    System.out.println("❌ Opção inválida. Digite uma opção entre 1 e 4.");
                    break;
            }

            System.out.println("\n"); // Adiciona um espaço para limpar a visualização
        }
        conta.close();
    }
}

