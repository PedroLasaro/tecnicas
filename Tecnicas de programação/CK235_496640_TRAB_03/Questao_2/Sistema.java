package CK235_496640_TRAB_03.Questao_2;

public class Sistema {
    Contas vetContas[];
    private int ind = 0;

    public Sistema() {
        vetContas = new Contas[10];
    }

    public void criarContaXTPOBasic(int i) {
        XTPOBasic XB = new XTPOBasic(i);
        vetContas[ind++] = XB;
    }

    public void criarContaXTPOPlus(int i) {
        XTPOPlus XP = new XTPOPlus(i);
        vetContas[ind++] = XP;
    }

    public void criarContaXTPOExtreme(int i) {
        XTPOExtreme XE = new XTPOExtreme(i);
        vetContas[ind++] = XE;
    }

    // acontece um polimorfismo de Coerção em valor, pois na main é passada um int que sera transformado em double.
    public void creditar(int id, double valor) {
        for (Contas c : vetContas) {
            if (id == c.getId()) {
                if (c instanceof XTPOBasic) {
                    c.addSaldo(valor);
                    return;
                }
                if (c instanceof XTPOPlus) {
                    c.addSaldo(valor + (valor * 0.005));
                    return;
                }
                if (c instanceof XTPOExtreme) {
                    c.addSaldo(valor + (valor * 0.002));
                    return;
                }
            }
        }
    }

    // acontece um polimorfismo de Coerção em valor, pois na main é passada um int que sera transformado em double.
    public void debitar(int id, double valor) {
        for (Contas c : vetContas) {
            if (id == c.getId()) {
                if (c instanceof XTPOExtreme) {
                    c.addSaldo(-valor + (valor * 0.002));
                    return;
                } else {
                    c.addSaldo(-valor);
                    return;
                }
            }
        }
    }

    public Object consultarSaldo(int id){
        for (Contas c : vetContas) {
            if (id == c.getId()){
                if ((int) c.getSaldo()==c.getSaldo()){
                    int a = (int) c.getSaldo();
                    return a;
                } else {
                    double a = (double) c.getSaldo();
                    return a;
                }
            }
        }
        return "Id incorreto";
    }

}
