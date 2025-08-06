public class Main {
    public static void main(String[] args) {
        //Pessoa 1
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Jean";
        pessoa.idade = 21;
        pessoa.CPF = "999.999.999-99";
        pessoa.falar("Olá! Eu gosto da cor azul!");
        pessoa.felizAniversario();
        System.out.println("Idade alterada para " + pessoa.idade);

        //Pessoa 2
        //Pessoa 1
        Pessoa outraPessoa = new Pessoa();
        outraPessoa.nome = "Marcela";
        outraPessoa.idade = 45;
        outraPessoa.CPF = "999.999.999-99";
        outraPessoa.falar("Olá! Eu gosto da cor preta!");
        outraPessoa.felizAniversario();
        System.out.println("Idade alterada para " + outraPessoa.idade);

    }
}
