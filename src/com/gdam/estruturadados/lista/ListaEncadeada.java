package com.gdam.estruturadados.lista;

public class ListaEncadeada<T> {
    private No<T> inicio;

    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);
        this.inicio = celula; // Aponta o inicio para a célula inicial
    }

    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + "]";
    }

}
