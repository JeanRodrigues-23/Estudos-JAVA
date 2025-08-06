public class ModeloCarro extends Carro{
    private String cor;
    private String uso;
    private int ano;

    public void corAnoUso(String cor, int ano, String uso) {
        this.cor = cor;
        this.ano = ano;
        this.uso = uso;
    }

    public void exibirInformacoes() {
        System.out.println("Informações sobre o carro:");
        System.out.println(String.format( """
                Modelo: %s
                Cor: %s
                Ano: %d
                Uso: %s
                Preço no primeiro ano: R$ %.2f
                Preço no segundo ano: R$ %.2f
                Preço no terceiro ano: R$ %.2f
                """, this.getModelo(), this.cor, this.ano, this.uso, this.getPrecoAno1(), this.getPrecoAno2(), this.getPrecoAno3()));
    }

}
