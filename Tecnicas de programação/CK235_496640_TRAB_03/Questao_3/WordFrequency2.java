package CK235_496640_TRAB_03.Questao_3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map.Entry;

public class WordFrequency2 {
    public static void main(String[] args) {

        String palavras = "eu amo amo java";
        String palavras_separadas[] = palavras.split(" ");

        ArrayList<String> lista_de_palavras = new ArrayList<>(Arrays.asList(palavras_separadas));

        TreeMap<String, Integer> dict = new TreeMap<>();

        for (String words : lista_de_palavras) {
            if (dict.containsKey(words)) {
                dict.put(words, dict.get(words) + 1);
            } else {
                dict.put(words, 1);
            }
        }

        System.out.println(palavras + "\n");

        for (Entry<String, Integer> entry : dict.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
