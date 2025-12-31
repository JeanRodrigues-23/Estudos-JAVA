package com.alura.screenmusic.model;

public enum Genero {
    POP("POP"),
    ROCK("Rock"),
    RAP("RAP"),
    JAZZ("Jazz"),
    BLUES("Blues"),
    CLASSICA("Classica"),
    ELETRRONICA("Eletronica"),
    REGGAE("Reggae");

    private final String genero;

    Genero(String genero) {
        this.genero = genero;
    }

    public static Genero retornaGenero(String genero) {
        for(Genero generoEnum : Genero.values()) {
            if (generoEnum.genero.equalsIgnoreCase(genero)) {
                return generoEnum;
            }
        }
        throw new IllegalArgumentException("Nenhum gênero encontrado para a String fornecida: " + genero);
    }
}
