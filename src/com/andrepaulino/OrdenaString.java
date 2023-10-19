package com.andrepaulino;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);

        ComparadorPorTamanho comparador = new ComparadorPorTamanho();
        palavras.sort(comparador);
        System.out.println(palavras);
    }
}
