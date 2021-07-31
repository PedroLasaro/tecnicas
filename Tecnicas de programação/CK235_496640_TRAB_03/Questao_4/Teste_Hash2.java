package CK235_496640_TRAB_03.Questao_4;

import java.util.*;

public class Teste_Hash2 {
    public static void main(String[] args) {

        Set<Object> mesesHash = new HashSet<>();

        mesesHash.add("Janeiro");
        mesesHash.add("Fevereiro");
        mesesHash.add("Março");
        mesesHash.add("Abril");
        mesesHash.add("Maio");
        mesesHash.add("Fevereiro");

        System.out.println("HashSet:");
        listar(mesesHash);
        // item c
        listar2(mesesHash);

        // item d
        TreeSet<Object> mesesTreeHash = new TreeSet<>();

        mesesTreeHash.add("Janeiro");
        mesesTreeHash.add("Fevereiro");
        mesesTreeHash.add("Março");
        mesesTreeHash.add("Abril");
        mesesTreeHash.add("Maio");
        mesesTreeHash.add("Fevereiro");

        System.out.println("TreeSet:");
        listar(mesesTreeHash);

        LinkedHashSet<Object> mesesLinkedHash = new LinkedHashSet<>();

        mesesLinkedHash.add("Janeiro");
        mesesLinkedHash.add("Fevereiro");
        mesesLinkedHash.add("Março");
        mesesLinkedHash.add("Abril");
        mesesLinkedHash.add("Maio");
        mesesLinkedHash.add("Fevereiro");

        System.out.println("LinkedSet:");
        listar(mesesLinkedHash);
    }

    // item b
    private static void listar(Collection<Object> c) {
        for (Object obj : c) {
            System.out.println(obj);
        }
        System.out.println();
    }

    // item c
    static void listar2(Collection c) {
        System.out.println("*** Listar 2 ***");
        for (Object o : c) {
            System.out.println(o);
        }
        System.out.println();
    }
}