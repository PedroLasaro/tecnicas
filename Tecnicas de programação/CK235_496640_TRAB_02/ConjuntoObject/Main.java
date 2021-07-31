package CK235_496640_TRAB_02.ConjuntoObject;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // adendo eu não conseguir da sort no ArrayList de Object então algumas coisa pode está desorganizada.
        ArrayList<Object> list = new ArrayList<Object>(Arrays.asList("gato",100,new StringBuilder("abc"),1.2));
        ArrayList<Object> list2 = new ArrayList<Object>(Arrays.asList(100,"lobo"));
        ArrayList<Object> list3 = new ArrayList<Object>(Arrays.asList("gato",1.2));
        ArrayList<Object> numerica = new ArrayList<Object>(Arrays.asList(1,2,3,4));
        ArrayList<Object> numerica1 = new ArrayList<Object>(Arrays.asList(1,2,3));

        ConjuntoO item = new ConjuntoO(list);
        ConjuntoO item2 = new ConjuntoO(list2);
        ConjuntoO item3 = new ConjuntoO(list3);
        ConjuntoO num = new ConjuntoO(numerica);
        ConjuntoO num1 = new ConjuntoO(numerica1);

        System.out.println(item.itens);
        boolean a = item.SubConjuntoO(item);
        System.out.println(a);
        ConjuntoO b = item.Pertence(item3);
        System.out.println(b.itens);
        ConjuntoO c = item.União(item2);
        System.out.println(c.itens);
        ConjuntoO d = item.Intersecção(item2);
        System.out.println(d.itens);
        ConjuntoO e = item.Diferença(item3);
        System.out.println(e.itens);
        System.out.println("Questão 14:");
        ConjuntoO pc = num.ProdutoCartersiano(num1);
        ConjuntoO po = num.Potencia();
        System.out.println("O Plano cartesiano é:" + pc.itens);
        System.out.println("O Conjunto potencia é:" + po.itens);
    }
}