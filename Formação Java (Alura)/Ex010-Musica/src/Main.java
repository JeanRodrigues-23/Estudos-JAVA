public class Main {
    public static void main(String[] args) {
        Musica TempoPerdido = new Musica();

        TempoPerdido.artista = "Renato Russo";
        TempoPerdido.titulo = "Tempo perdido";
        TempoPerdido.anoLancamento = 1986;
        TempoPerdido.somaAvalicoes = 500;
        TempoPerdido.totalAvaliacoes = 99;

        TempoPerdido.exibeFicha();
        TempoPerdido.avaliaMusica(4);
        System.out.println("A avaliação da música é " + TempoPerdido.pegaMedia());
    }
}
