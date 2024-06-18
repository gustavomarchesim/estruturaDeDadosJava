package com.gdam.estruturadados.lista;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

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

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + "]";
    }

}
