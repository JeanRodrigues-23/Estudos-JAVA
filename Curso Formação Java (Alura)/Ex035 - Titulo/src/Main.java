import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Titulo filme1 = new Titulo("Carros");
        Titulo filme2 = new Titulo("Barbie");
        Titulo filme3 = new Titulo("Telefone Preto");
        Titulo filme4 = new Titulo("Toy Story");
        Titulo filme5 = new Titulo("Avatar");
        Titulo filme6 = new Titulo("Homem Aranha");
        Titulo filme7 = new Titulo("Batman");

        ArrayList<Titulo> listaFilmes = new ArrayList<>();
        listaFilmes.add(filme1);
        listaFilmes.add(filme2);
        listaFilmes.add(filme3);
        listaFilmes.add(filme4);
        listaFilmes.add(filme5);
        listaFilmes.add(filme6);
        listaFilmes.add(filme7);

        Collections.sort(listaFilmes);
        System.out.println(listaFilmes);
    }
}
