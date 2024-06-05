package com.gdam.estruturadados.pilhas;

import com.gdam.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) {
        this.aumentaCapacidade();
        super.adiciona(elemento);
    }

    public T espia() {
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[tamanho - 1];
    }

    public void desempilha() {
        super.remove(tamanho - 1);
    }

}
