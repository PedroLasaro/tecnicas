package CK235_496640_TRAB_02.ConjuntoObject;

import java.util.*;

public class ConjuntoO {
    public ArrayList<Object> itens;

    public ConjuntoO() {
        itens = new ArrayList<Object>();
    }

    public ConjuntoO(ArrayList<Object> itens) {
        this.itens = itens;
    }

    public void Add(Object ob) {
        for (Object i : itens) {
            if (i == ob)
                return;
        }
        itens.add(ob);
    }

    public ConjuntoO Pertence(ConjuntoO conj) {
        ConjuntoO res = new ConjuntoO();
        for (Object i : itens) {
            for (Object in : conj.itens) {
                if (i == in)
                    res.Add(in);
            }
        }
        return res;
    }

    public boolean Pertence(Object num) {
        for (Object i : itens) {
            if (i == num)
                return true;
        }
        return false;
    }

    public boolean Igual(ConjuntoO parametro) {
        // Collections.sort(itens);
        // Collections.sort(parametro.itens);
        return itens.equals(parametro.itens);
    }

    public boolean SubConjuntoO(ConjuntoO subconj) {
        if (Igual(subconj))
            return true;
        for (Object i : subconj.itens) {
            int l = -1;
            for (Object i1 : itens) {
                l++;
                if (i == i1) {
                    continue;
                }
                if (l == itens.size())
                    return false;
            }
        }
        return true;

    }

    public ConjuntoO União(ConjuntoO parametro) {
        if (Igual(parametro))
            return parametro;
        ConjuntoO res = new ConjuntoO();
        for (Object i : itens) {
            res.Add(i);
        }
        for (Object i : parametro.itens) {
            res.Add(i);
        }
        // Collections.sort(res.itens);
        return res;
    }

    public ConjuntoO Intersecção(ConjuntoO parametro) {
        if (Igual(parametro))
            return parametro;
        ConjuntoO res = new ConjuntoO();
        for (Object i : itens) {
            for (Object in : parametro.itens) {
                if (i == in) {
                    res.Add(in);
                }
            }
        }
        return res;
    }

    public ConjuntoO Diferença(ConjuntoO parametro) {
        if (Igual(parametro)) {
            ConjuntoO novo = new ConjuntoO();
            return novo;
        }
        ArrayList<Integer> lista = new ArrayList<Integer>();
        ConjuntoO res = new ConjuntoO();
        for (Object i : itens) {
            res.Add(i);
        }
        for (Object i : itens) {
            for (Object in : parametro.itens) {
                if (i.equals(in)) {
                    lista.add(itens.indexOf(i));
                    continue;
                }
            }
        }
        Collections.sort(lista, Collections.reverseOrder());
        for (int a : lista) {
            res.itens.remove(a);
        }
        return res;
    }
    // Questão 14 //

    public ConjuntoO ProdutoCartersiano(ConjuntoO conj) {
        ConjuntoO res = new ConjuntoO();
        for (Object i : itens) {
            for (Object in : conj.itens) {
                ArrayList<Object> aux = new ArrayList<Object>();
                aux = new ArrayList<Object>(Arrays.asList(i,in));
                res.Add(aux);
            }
        }
        return res;
    }

    public ConjuntoO Potencia() {
        ConjuntoO res = new ConjuntoO();
        ArrayList<Object> aux = new ArrayList<Object>();
        ArrayList<Object> aux2 = new ArrayList<Object>();
        res.Add(0); // 0 representa o conjunto vazio.
        int tam = (int) Math.pow(2, itens.size());
        for (int a = 0; a < tam; a++) {
            for (Object i : itens) {
                for (Object in : itens) {
                    if (i == in) {
                        aux = new ArrayList<Object>(Arrays.asList(i));
                        res.Add((aux));
                        --tam;
                    }
                    aux = new ArrayList<Object>(Arrays.asList(i, in));
                    res.Add(aux);
                    --tam;
                }
            }
        }

        for (Object o : itens) {
            aux2.add(o);
        }
        res.Add(aux2);
        return res;
    }
}
