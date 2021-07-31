package CK235_496640_TRAB_03.Questao_3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;

public class CountWords {
    public static void main(String[] args) {

        String palavras = "eu amo amo java";
        String palavras_separadas[] = palavras.split(" ");

        ArrayList<String> lista_de_palavras = new ArrayList<>(Arrays.asList(palavras_separadas));

        HashSet<String> conjunto_de_palavras = new HashSet<>(lista_de_palavras);

        System.out.println(palavras + "\n");
        System.out.println("Total de Palavras:" + lista_de_palavras.size());
        System.out.println("Total de Palavras Distintas:" + conjunto_de_palavras.size());
    }
}
