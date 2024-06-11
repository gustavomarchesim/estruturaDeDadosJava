package com.gdam.estruturadados.filas;

import com.gdam.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(T elemento) {
        super.adiciona(elemento);
    }

    public void desenfileira() {
        for (int i = 0; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        tamanho--;
    }

    public T espia() {
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }

}
