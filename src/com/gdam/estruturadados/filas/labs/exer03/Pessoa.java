package com.gdam.estruturadados.filas.labs.exer03;

public class Pessoa implements Comparable<Pessoa> {

    private Integer prioridade;

    public Pessoa() {
    }

    public Pessoa(Integer prioridade) {
        this.prioridade = prioridade;
    }

    public Integer getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Pessoa [prioridade=" + prioridade + "]";
    }

    @Override
    public int compareTo(Pessoa outra) {
        // Comparação com base na prioridade
        return Integer.compare(this.prioridade, outra.prioridade);
    }
}
