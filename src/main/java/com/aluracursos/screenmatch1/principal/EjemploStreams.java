package com.aluracursos.screenmatch1.principal;

import java.util.Arrays;
import java.util.List;

public class EjemploStreams {
    public void muestraEjemplo() {
        List<String> nombres = Arrays.asList("Juan", "Ana", "Pedro", "Maria", "Luis");

        nombres.stream()
                .sorted()
                .limit(4)
                .filter(n -> n.startsWith("L"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
