package CK235_496640_TRAB_03.Questao_2;

public class XTPOPlus extends Contas {

    // Polimorfismo de sobrecarga
    public XTPOPlus(int id, double saldo) {
        this.setSaldo(saldo);
        this.setId(id);
    }

    public XTPOPlus(int id) {
        this.setSaldo(0);
        this.setId(id);
    }
}
