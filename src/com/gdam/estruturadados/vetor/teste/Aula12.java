package com.gdam.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        System.out.println(arrayList);

        arrayList.clear();
        
        System.out.println(arrayList);

    }
}