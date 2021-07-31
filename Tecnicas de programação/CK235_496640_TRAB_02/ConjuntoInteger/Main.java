package CK235_496640_TRAB_02.ConjuntoInteger;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(0, 2, 4, 6, 8));
        ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
        ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));

        Conjunto item_1 = new Conjunto(list1);
        Conjunto item_2 = new Conjunto(list2);
        Conjunto item_3 = new Conjunto(list3);
        Conjunto item_4 = new Conjunto(list4);

        System.out.println("Questão 12:");
        System.out.println("a)" + item_4.SubConjunto(item_4));
        Conjunto b1 = item_1.Pertence(item_2);
        Conjunto b2 = item_1.Pertence(item_3);
        Conjunto b3 = item_1.Pertence(item_4);
        System.out.println("b)");
        System.out.println("os seguintes elemento de 2 pertencem ao conjunto 1" + b1.itens);
        System.out.println("os seguintes elemento de 3 pertencem ao conjunto 1" + b2.itens);
        System.out.println("os seguintes elemento de 4 pertencem ao conjunto 1" + b3.itens);
        Conjunto c = item_2.União(item_3);
        System.out.println("c)" + c.itens + "é igual a: " + item_1.itens + ',' + c.Igual(item_1));
        Conjunto d = item_1.intersecção(item_2);
        System.out.println("d) a intersecção de 1 e 2 é " + d.itens);
        Conjunto e = item_1.Diferença(item_2);
        System.out.println("e) a diferença de 1 e 2 é" + e.itens);
    }
}
