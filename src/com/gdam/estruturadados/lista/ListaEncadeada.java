package com.gdam.estruturadados.lista;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    private final int NAO_ENCONTRADO = -1;

    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);

        if (this.tamanho == 0) {
            this.inicio = celula; // Aponta o inicio para a célula inicial
        } else {
            this.ultimo.setProximo(celula); // Aponta o elemento adicionado como sendo o ultimo e por consequencia, o
                                            // proximo.
        }
        this.ultimo = celula;
        this.tamanho++;

    }

    public void adicionaInicio(T elemento) {
        if (this.tamanho == 0) {
            No<T> novoNo = new No<T>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else {
            No<T> novoNo = new No<T>(elemento, this.inicio);
            this.inicio = novoNo;
        }
        this.tamanho++;
    }

    public void adiciona(int posicao, T elemento) {

        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }

        if (this.tamanho == 0) {
            this.adicionaInicio(elemento);
        } else if (posicao == this.tamanho) {
            this.adiciona(elemento);
        } else {
            No<T> noAnterior = this.buscaNo(posicao);
            No<T> proximoNo = noAnterior.getProximo();
            No<T> novoNo = new No<T>(elemento, proximoNo);
            noAnterior.setProximo(novoNo);
            this.tamanho++;
        }
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void limpa() {

        for (No<T> atual = this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;

    }

    public No<T> buscaNo(int posicao) {

        if (!(posicao >= 0 && posicao <= this.tamanho)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        No<T> noAtual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }
        return noAtual;
    }

    public T buscaPorPosicao(int posicao) {
        return this.buscaNo(posicao).getElemento();
    }

    public int busca(T elemento) {

        No<T> atual = this.inicio;
        int pos = 0;

        while (atual != null) {

            if (atual.getElemento().equals(elemento)) {
                return pos;
            }
            pos++;
            atual = atual.getProximo();
        }

        return NAO_ENCONTRADO;
    }

    @Override
    public String toString() {

        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");

        No<T> atual = this.inicio;
        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");

        /*
         * f
         * builder.append(atual.getElemento()).append(",");
         * while (atual.getProximo() != null) {
         * atual = atual.getProximo();
         * builder.append(atual.getElemento()).append(",");
         * }
         */

        return builder.toString();
    }
}
