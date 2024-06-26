package com.gdam.estruturadados.vetor;

import java.util.Arrays;

public class VetorObject {

    private Object[] elementos;
    private int tamanho;

    public VetorObject(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(Object elemento) {
        aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    /**
     * Adiciona um elemento em qualquer posição do vetor com base na posição
     * recebida
     * 
     * @param posicao  recebe a posição no vetor a ser preenchida
     * @param elemento recebe o elemento que ocupara a posição
     * @return boolean
     */
    public boolean adiciona(int posicao, Object elemento) {
        aumentaCapacidade();
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida!");
        }

        // Move todos os elementos
        for (int i = tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        // Atribui o índice a posição
        this.elementos[posicao] = elemento;
        // adiciona um ao tamanho
        this.tamanho++;

        return true;
    }

    public void remove(int posicao) {

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida!");
        }

        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        this.tamanho--;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Object[] elementosNovos = Arrays.copyOf(elementos, elementos.length * 2);
            this.elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    public Object busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        return this.elementos[posicao];
    }

    public int busca(Object elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }
}