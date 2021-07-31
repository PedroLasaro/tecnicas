package CK235_496640_TRAB_03.Questao_2;

public class XTPOExtreme extends Contas {

    // Polimorfismo de sobrecarga
    public XTPOExtreme(int id, double saldo) {
        this.setSaldo(saldo);
        this.setId(id);
    }

    public XTPOExtreme(int id) {
        this.setSaldo(0);
        this.setId(id);
    }
}
