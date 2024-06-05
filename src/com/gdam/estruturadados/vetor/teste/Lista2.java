package com.gdam.estruturadados.vetor.teste;

import com.gdam.estruturadados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {

    public Lista2(int capacidade) {
        super(capacidade);
    }

    public Lista2() {
        super();
    }

    @Override
    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    @Override
    public boolean adiciona(int posicao, T elemento) {
        return super.adiciona(posicao, elemento);
    }

    @Override
    public void remove(int posicao) {
        super.remove(posicao);
    }

    public T busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        return elementos[posicao];
    }

    public int busca(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
}
