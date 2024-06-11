package com.gdam.estruturadados.filas.teste;

import com.gdam.estruturadados.filas.Fila;

public class Aula21 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileira(1);
        fila.enfileira(3);
        fila.enfileira(4);

        System.out.println(fila.tamanho()); // 3
        System.out.println(fila.espia()); // 1
    }
}
