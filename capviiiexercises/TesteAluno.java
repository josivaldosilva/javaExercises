package capviiiexercises;

import java.util.Scanner;
import java.util.Vector;

public class TesteAluno {
    private static Vector<Aluno> todosAlunos = new Vector<>(50);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("1 - Inserir Aluno");
            System.out.println("2 - Consultar Aluno");
            System.out.println("3 - Listar Alunos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o caractere de nova linha

            switch (opcao) {
                case 1:
                    inserirAluno();
                    break;
                case 2:
                    consultarAluno();
                    break;
                case 3:
                    listarTodosAlunos();
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    public static void inserirAluno() {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade do aluno: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o número do estudante: ");
        int numeroEstudante = scanner.nextInt();
        scanner.nextLine(); // Consumir o caractere de nova linha

        Aluno aluno = new Aluno(nome, idade, numeroEstudante);
        todosAlunos.add(aluno);
        System.out.println("Aluno inserido com sucesso.");
    }

    public static void consultarAluno() {
        System.out.print("Digite o número do estudante: ");
        int numeroEstudante = scanner.nextInt();

        for (Aluno aluno : todosAlunos) {
            if (aluno.numeroEstudante == numeroEstudante) {
                aluno.imprimirDados();
                return;
            }
        }

        System.out.println("Aluno não encontrado.");
    }

    public static void listarTodosAlunos() {
        if (todosAlunos.isEmpty()) {
            System.out.println("Não há alunos cadastrados.");
            return;
        }

        for (Aluno aluno : todosAlunos) {
            aluno.imprimirDados();
            System.out.println();
        }
    }
}