package edu.lucaslowhan.test;

import edu.lucaslowhan.domain.ListaTarefas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n### MENU - LISTA DE TAREFAS ###");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Remover tarefa");
            System.out.println("4. Marcar como concluída");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite a descrição da tarefa: ");
                    String descricao = sc.nextLine();
                    lista.adicionarTarefa(descricao);
                    break;
                case 2:
                    lista.listarTarefas();
                    break;
                case 3:
                    System.out.println("Digite a tarefa que quer remover: ");
                    int remover = sc.nextInt() - 1;
                    lista.removerTarefa(remover);
                    break;
                case 4:
                    System.out.println("Digite o número da tarefa a marcar como concluída: ");
                    int concluir = sc.nextInt() - 1;
                    lista.marcarConcluida(concluir);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
