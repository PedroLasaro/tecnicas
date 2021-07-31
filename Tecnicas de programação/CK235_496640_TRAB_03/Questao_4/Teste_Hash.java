package CK235_496640_TRAB_03.Questao_4;

import java.util.*;

public class Teste_Hash {
    public static void main(String[] args) {

        Set<String> mesesHash = new HashSet<>();

        mesesHash.add("Janeiro");
        mesesHash.add("Fevereiro");
        mesesHash.add("Março");
        mesesHash.add("Abril");
        mesesHash.add("Maio");
        mesesHash.add("Fevereiro");

        System.out.println("HashSet:");
        System.out.println(mesesHash);
    }
}
