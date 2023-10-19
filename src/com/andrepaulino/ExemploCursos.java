package com.andrepaulino;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(Curso::getAlunos));

        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .findFirst();

        List<Curso> cursosFiltrados = cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .collect(Collectors.toList());

        int totalAlunos = cursos.stream().mapToInt(Curso::getAlunos).sum();
        System.out.println("Total de alunos: " + totalAlunos);

        Stream<String> nomes = cursos.stream().map(Curso::getNome);

        cursos.stream()
                .mapToInt(c -> c.getAlunos())
                .average();

        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .map(Curso::getAlunos)
                .forEach(System.out::println);
    }
}
