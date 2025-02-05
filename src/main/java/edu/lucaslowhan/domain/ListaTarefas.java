package edu.lucaslowhan.domain;

import java.util.ArrayList;

public class ListaTarefas {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
        System.out.println("Tarefa adicionada com sucesso.");
    }

    public void listarTarefas(){
        if(tarefas.isEmpty()){
            System.out.println("A lista de tarefas esta vazia");
        }else{
            for(int i = 0; i<tarefas.size() ; i++){
                System.out.println((i+1) + ". " + tarefas.get(i));
            }
        }
    }
    public void removerTarefa(int index){
        if(index >= 0 && index < tarefas.size()){
            tarefas.remove(index);
            System.out.println("Tarefa removida com sucesso.");
        }else {
            System.out.println("Tarefa não encontrada");
        }
    }
    public void marcarConcluida(int index){
        if(index >= 0 && index < tarefas.size()){
            tarefas.get(index).marcarComoConcluida();
            System.out.println("Tarefa concluida com sucesso");
        }else {
            System.out.println("Tarefa não encontrada");
        }
    }
}
