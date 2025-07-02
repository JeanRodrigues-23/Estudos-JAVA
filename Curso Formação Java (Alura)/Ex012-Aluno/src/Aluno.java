public class Aluno {
    String nome;
    int idade;

    void exibeInformacoes(){
        System.out.println(String.format("""
                INFORMAÇÕES SOBRE O ALUNO
                Nome: %s
                Idade: %d
                """, nome, idade));
    }
}
