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

    public T desenfileira() {
        if (this.estaVazia()) {
            return null;
        }

        T elementoRemovido = this.elementos[0];
        this.remove(0);
        return elementoRemovido;
    }

    public T espia() {
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }
}
