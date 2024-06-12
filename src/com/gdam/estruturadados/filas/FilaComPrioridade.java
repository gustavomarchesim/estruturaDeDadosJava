package com.gdam.estruturadados.filas;

public class FilaComPrioridade<T extends Comparable<T>> extends Fila<T> {

    public FilaComPrioridade() {
        super();
    }

    public FilaComPrioridade(int capacidade) {
        super(capacidade);
    }

    @Override
    public void enfileira(T elemento) {
        int i;
        for (i = 0; i < this.tamanho; i++) {
            if (elemento.compareTo(this.elementos[i]) < 0) {
                break;
            }
        }
        this.adiciona(i, elemento);
    }
}
