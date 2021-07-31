package CK235_496640_TRAB_03.Questao_1;

public class RetanguloColorido implements Colorida {
    public float ladox, ladoy;
    public Ponto origem;
    public String cor;

    RetanguloColorido(Ponto origem, float ladox, float ladoy, String cor) {
        this.origem = origem;
        this.ladox = ladox;
        this.ladoy = ladoy;
        this.cor = cor;
    }

    RetanguloColorido(Ponto origem, float lado, String cor) {
        this.origem = origem;
        this.ladox = lado;
        this.ladoy = lado;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Figura tipo " + getClass().getSimpleName() + " da cor " + cor;
    }

    @Override
    public String desenhar() {
        return toString();
    }

    @Override
    public void move(float dx, float dy) {
        origem.mover(dx, dy);
    }

    @Override
    public float calcularArea() {
        return ladox * ladoy;
    }
}
