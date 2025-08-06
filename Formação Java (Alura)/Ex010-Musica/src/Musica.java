public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int somaAvalicoes;
    int totalAvaliacoes;

    void exibeFicha(){
        System.out.println(String.format("""
                Ficha técnica:
                
                Titulo: %s
                Artista: %s
                Ano de lançamento: %d
                Avaliação: %d
                Quantidade de avaliações: %d
                """, titulo, artista, anoLancamento, somaAvalicoes, totalAvaliacoes));
    }

    void avaliaMusica(int avaliacao){
        somaAvalicoes += avaliacao;
        totalAvaliacoes ++;
    }

    double pegaMedia(){
        return somaAvalicoes / totalAvaliacoes;
    }
}
