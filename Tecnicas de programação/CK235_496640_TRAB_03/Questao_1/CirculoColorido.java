package CK235_496640_TRAB_03.Questao_1;

public class CirculoColorido implements Colorida {
    public float raio;
    public Ponto origem;
    public String cor;

    CirculoColorido(Ponto origem, float raio, String cor) {
        this.origem = origem;
        this.raio = raio;
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
        return (float) ((raio * raio) * 3.14);
    }
}
