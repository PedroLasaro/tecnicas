package CK235_496640_TRAB_03.Questao_3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import static java.util.Collections.reverseOrder;

public class WordFrequency3 {
    public static void main(String[] args) {

        String palavras = "eu amo amo java";
        String palavras_separadas[] = palavras.split(" ");

        ArrayList<String> lista_de_palavras = new ArrayList<>(Arrays.asList(palavras_separadas));

        HashMap<String, Integer> dict = new HashMap<>();

        for (String words : lista_de_palavras) {
            if (dict.containsKey(words)) {
                dict.put(words, dict.get(words) + 1);
            } else {
                dict.put(words, 1);
            }
        }

        System.out.println(palavras + "\n");
        // foreach para cada par do dicionario organizado Alfabeticamente de maneira decrescente
        for (Entry<String, Integer> entry : dict.entrySet().stream().sorted(reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList())) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
