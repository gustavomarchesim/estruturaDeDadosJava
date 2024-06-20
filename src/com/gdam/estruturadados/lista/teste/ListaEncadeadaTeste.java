package com.gdam.estruturadados.lista.teste;

import com.gdam.estruturadados.lista.ListaEncadeada;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        // testesIniciais();
        // adicionaNoInicio();
        // adicionaPorPosicao();
        removeInicio();
    }

    public static void removeInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);

        System.out.println(lista.removeInicio());
        System.out.println(lista);

        lista.removeInicio();
    }

    public static void adicionaPorPosicao() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        // lista.adiciona(-1, 1);
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(4); // 1,2,4

        lista.adicionaInicio(0); // 0,1,2,4
        lista.adiciona(4, 5); // 0,1,2,4,5
        lista.adiciona(2, 3); // 0,1,2,3,4,5

        System.out.println(lista);

    }

    public static void adicionaNoInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adicionaInicio(3);
        lista.adicionaInicio(2);
        lista.adicionaInicio(1);

        System.out.println(lista);

    }

    public static void testesIniciais() {
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
