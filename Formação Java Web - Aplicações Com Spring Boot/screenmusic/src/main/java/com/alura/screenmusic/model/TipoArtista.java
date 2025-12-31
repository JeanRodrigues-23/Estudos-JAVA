package com.alura.screenmusic.model;

public enum TipoArtista {
    SOLO("solo"),
    DUPLA("dupla"),
    BANDA("banda");

    private final String tipoArtista;

    TipoArtista(String tipoArtista) {
        this.tipoArtista = tipoArtista;
    }

    public TipoArtista retornaTipoArtista(String tipoArtista) {
        for (TipoArtista tipoArtistaEnum : TipoArtista.values()) {
            if (tipoArtistaEnum.tipoArtista.equalsIgnoreCase(tipoArtista)) {
                return tipoArtistaEnum;
            }
        }
        throw new IllegalArgumentException("Não existe este tipoArtista na Enum: " + tipoArtista);
    }
}
