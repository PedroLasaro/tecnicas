package CK235_496640_TRAB_03.Questao_1;

public abstract class Figura {
    float x, y, d;

    // item A
    @Override
    public String toString() {
        return "Figura tipo " + getClass().getSimpleName();
    }

    public abstract String desenhar();

    // item B
    public abstract void move(float dx, float dy);

    // item C
    public abstract float calcularArea();
}
