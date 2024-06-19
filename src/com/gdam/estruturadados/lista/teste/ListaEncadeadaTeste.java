package com.gdam.estruturadados.lista.teste;

import com.gdam.estruturadados.lista.ListaEncadeada;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);

        System.out.println("Tamanho = " + lista.getTamanho());
        System.out.println(lista);

        lista.adiciona(2);
        System.out.println(lista);

        lista.adiciona(3);
        System.out.println(lista);

        // lista.limpa();
        // System.out.println(lista);

        // busca por elemento
        System.out.println("********** Busca por elemento");
        System.out.println(lista.busca(1));
        System.out.println(lista.busca(2));
        System.out.println(lista.busca(3));
        System.out.println(lista.busca(0));

        // Busca por posição
        System.out.println("********** Busca por elemento");
        System.out.println(lista.buscaPorPosicao(1));
        System.out.println(lista.buscaPorPosicao(2));
        System.out.println(lista.buscaPorPosicao(3));
        System.out.println(lista.buscaPorPosicao(0));

    }
}
