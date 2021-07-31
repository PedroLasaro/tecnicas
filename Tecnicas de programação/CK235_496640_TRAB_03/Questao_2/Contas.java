package CK235_496640_TRAB_03.Questao_2;

public class Contas {
    private double saldo;
    private int id;

    public double getSaldo() {
        return saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void addSaldo(double valor){
        this.saldo += valor;
    }

    @Override
    public String toString() {
    return "ID: " + id +
    "\nConta: " + getClass().getSimpleName() +
    "\nSaldo: " + saldo;
    }
}
