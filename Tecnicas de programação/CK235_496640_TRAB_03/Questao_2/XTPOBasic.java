package CK235_496640_TRAB_03.Questao_2;

public class XTPOBasic extends Contas {

    // Polimorfismo de sobrecarga
    public XTPOBasic(int id, double saldo) {
        this.setSaldo(saldo);
        this.setId(id);
    }

    public XTPOBasic(int id) {
        this.setSaldo(0);
        this.setId(id);
    }
}
