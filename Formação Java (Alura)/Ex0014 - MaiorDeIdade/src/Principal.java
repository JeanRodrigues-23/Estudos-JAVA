public class Principal {

    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();

        pessoa1.setNome("Jean");
        pessoa1.setIdade(21);

        System.out.println(String.format("O nome é %s e a idade é %d", pessoa1.getNome(), pessoa1.getIdade()));
        pessoa1.verificarIdade();

        pessoa1.setIdade(17);
        System.out.println("Idade atualizada para " + pessoa1.getIdade() + " anos de idade!");
        pessoa1.verificarIdade();
    }

}
