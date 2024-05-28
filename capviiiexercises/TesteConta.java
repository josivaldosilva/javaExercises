package capviiiexercises;

import java.util.Scanner;
import java.util.Vector;

public class TesteConta {
    private static Vector<Conta> todasContas = new Vector<>(50);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("1 - Criar conta");
            System.out.println("2 - Consultar Conta");
            System.out.println("3 - Listar Contas");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o caractere de nova linha

            switch (opcao) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    consultarConta();
                    break;
                case 3:
                    listarContas();
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    public static void criarConta() {
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        System.out.print("Digite o nome do dono: ");
        String nomeDono = scanner.nextLine();
        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Consumir o caractere de nova linha

        Conta conta = new Conta(numero, nomeDono, saldo);
        todasContas.add(conta);
        System.out.println("Conta criada com sucesso.");
    }

    public static void consultarConta() {
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();

        for (Conta conta : todasContas) {
            if (conta.numero == numero) {
                conta.imprimirDados();
                return;
            }
        }

        System.out.println("Conta não encontrada.");
    }

    public static void listarContas() {
        if (todasContas.isEmpty()) {
            System.out.println("Não há contas cadastradas.");
            return;
        }

        for (Conta conta : todasContas) {
            conta.imprimirDados();
            System.out.println();
        }
    }
}