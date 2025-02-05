package edu.lucaslowhan.domain;

public class Tarefa {
    protected String descricao;
    protected boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return this.concluida;
    }

    public void marcarComoConcluida(){
        this.concluida = true;
    }

    @Override
    public String toString() {
        return (concluida ? "[✔]" : "[ ]") + descricao;
    }
}
