package CK235_496640_TRAB_03.Questao_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Itemf {
    public static void main(String[] args) {
        HashSet<String> t1 = new HashSet<>();
        TreeSet<String> t2 = new TreeSet<>();
        LinkedHashSet<String> t3 = new LinkedHashSet<>();
        ArrayList<String> t4 = new ArrayList<>();
        String[] lista = new String[4];
        lista[0] = "isso";
        lista[1] = "é";
        lista[2] = "apenas";
        lista[3] = "um teste";

        ClassedoItemE c1 = new ClassedoItemE(t1, lista);
        ClassedoItemE c2 = new ClassedoItemE(t2, lista);
        ClassedoItemE c3 = new ClassedoItemE(t3, lista);
        ClassedoItemE c4 = new ClassedoItemE(t4, lista);

        System.out.println("com HashSet");
        c1.verificar();
        System.out.println("\ncom TreeSet");
        c2.verificar();
        System.out.println("\ncom LinkedHashSet");
        c3.verificar();
        System.out.println("\ncom Arraylist");
        c4.verificar();
    }
}
