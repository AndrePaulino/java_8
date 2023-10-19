package com.andrepaulino;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaString {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        // Consumer<String> consumidor = new ImprimeNaLinha();
        // palavras.forEach(consumidor);
        // palavras.forEach(s -> System.out.println(s));
        palavras.forEach(System.out::println);

        // ComparadorPorTamanho comparador = new ComparadorPorTamanho();
        // palavras.sort(comparador);
        // palavras.sort((s1, s2) -> s1.length() - s2.length());
        // palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparing(String::length));
        System.out.println(palavras);
    }
}
