public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFicha(){
        System.out.println(String.format("""
                Ficha técnica do carro:
                
                Modelo: %s
                Ano: %d
                Cor: %s
                """, modelo, ano, cor));
    }

    int calculaIdade(){
        return 2025 - ano;
    }
}
