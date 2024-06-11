package com.gdam.estruturadados.filas.teste;

import com.gdam.estruturadados.filas.Fila;

public class Aula22 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila); // [1, 2, 3]
        System.out.println(fila.tamanho()); // 3

        fila.desenfileira();

        System.out.println(fila); // [2, 3]
        System.out.println(fila.tamanho()); // 2

    }
}
