package CK235_496640_TRAB_02.ConjuntoInteger;

import java.util.*;

public class Conjunto {
    public ArrayList<Integer> itens;

    public Conjunto() {
        itens = new ArrayList<Integer>();
    }

    public Conjunto(ArrayList<Integer> itens) {
        this.itens = itens;
    }

    public void Add(int num) {
        for (int i : itens) {
            if (i == num)
                return;
        }
        itens.add(num);
    }

    public Conjunto Pertence(Conjunto conj) {
        Conjunto res = new Conjunto();
        for (int i : itens) {
            for (int in : conj.itens) {
                if (i == in)
                    res.Add(in);
            }
        }
        return res;
    }

    public boolean Pertence(int num) {
        for (int i : itens) {
            if (i == num)
                return true;
        }
        return false;
    }

    public boolean Igual(Conjunto parametro) {
        Collections.sort(itens);
        Collections.sort(parametro.itens);
        return itens.equals(parametro.itens);
    }

    public boolean SubConjunto(Conjunto subconj) {
        if (Igual(subconj))
            return true;
        for (int i : subconj.itens) {
            int l = -1;
            for (int i1 : itens) {
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

    public Conjunto União(Conjunto parametro) {
        if (Igual(parametro))
            return parametro;
        Conjunto res = new Conjunto();
        for (int i : itens) {
            res.Add(i);
        }
        for (int i : parametro.itens) {
            res.Add(i);
        }
        Collections.sort(res.itens);
        return res;
    }

    public Conjunto intersecção(Conjunto parametro) {
        if (Igual(parametro))
            return parametro;
        Conjunto res = new Conjunto();
        for (int i : itens) {
            for (int in : parametro.itens) {
                if (i == in) {
                    res.Add(in);
                }
            }
        }
        return res;
    }

    public Conjunto Diferença(Conjunto parametro) {
        if (Igual(parametro)) {
            Conjunto novo = new Conjunto();
            return novo;
        }
        Conjunto res = new Conjunto();
        for (int i : itens) {
            res.Add(i);
        }
        for (int i : itens) {
            for (int in : parametro.itens) {
                if (i == in) {
                    res.itens.remove(new Integer(i));
                }
            }
        }
        return res;
    }
}