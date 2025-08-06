import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File arquivo = new File("G:\\Meu Drive\\Nuvem\\Área dos estudos\\Estudos\\Linguagens\\Java\\Curso Formação Java (Alura)\\arquivo.txt");

        if (arquivo.exists()) {
            System.out.println("Não foi possível criar, pois o arquivo já existe!");
        } else {
            try {
                FileWriter escrever = new FileWriter("arquivo.txt");
                escrever.write("Conteúdo a ser gravado no arquivo.");
                escrever.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }


            System.out.println("Arquivo criado!");
        }

    }
}
