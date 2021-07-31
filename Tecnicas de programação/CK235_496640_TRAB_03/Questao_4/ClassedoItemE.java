package CK235_496640_TRAB_03.Questao_4;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ClassedoItemE {
    Collection<String> c;
    String[] array;

    public ClassedoItemE(Collection<String> c, String[] array) {
        this.c = c;
        this.array = array;
        this.c.addAll(Arrays.asList(this.array));
    }

    void verificar() {
        if (c instanceof Set) {
            System.out.println("permite a inclusão de elementos duplicados: não");
            if (c instanceof LinkedHashSet) {
                System.out.println("ordena automaticamente os elementos inseridos nela: não");
                System.out.println("garante a ordem de entrada dos elementos na coleção: sim");
            } else if (c instanceof TreeSet) {
                System.out.println("ordena automaticamente os elementos inseridos nela: sim");
                System.out.println("garante a ordem de entrada dos elementos na coleção: não");
            } else if (c instanceof HashSet) {
                System.out.println("ordena automaticamente os elementos inseridos nela: não");
                System.out.println("garante a ordem de entrada dos elementos na coleção: não");
            }
        }
        if (c instanceof Map) {
            System.out.println("permite a inclusão de elementos duplicados: sim");
            if (c instanceof LinkedHashMap) {
                System.out.println("ordena automaticamente os elementos inseridos nela: não");
                System.out.println("garante a ordem de entrada dos elementos na coleção: sim");
            } else if (c instanceof TreeMap) {
                System.out.println("ordena automaticamente os elementos inseridos nela: sim");
                System.out.println("garante a ordem de entrada dos elementos na coleção: não");
            }
        }
        if (c instanceof List) {
            System.out.println("permite a inclusão de elementos duplicados: sim");
            if (c instanceof LinkedList) {
                System.out.println("ordena automaticamente os elementos inseridos nela: não");
                System.out.println("garante a ordem de entrada dos elementos na coleção: sim");
            } else {
                System.out.println("ordena automaticamente os elementos inseridos nela: não");
                System.out.println("garante a ordem de entrada dos elementos na coleção: não");
            }
        }
    };
}

// permite a inclusão de elementos duplicados;
// ordena automaticamente os elementos inseridos nela;
// garante a ordem de entrada dos elementos na coleção;
