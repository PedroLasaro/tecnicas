package CK235_496640_TRAB_03.Questao_1;

public class Retangulo extends Figura {
    Ponto pRect = new Ponto(0);

    // item D:
    public Retangulo(Ponto p, int x, int y) {
        this.pRect = p;
        this.x = x;
        this.y = y;
        this.d = 1;
    }

    public Retangulo(Ponto p, int lado) {
        this.pRect = p;
        this.x = lado;
        this.y = lado;
        this.d = 1;
    }

    public Retangulo(int lado) {
        this.pRect = new Ponto();
        this.x = lado;
        this.y = lado;
        this.d = 1;
    }

    public Retangulo(int x ,int y) {
        this.pRect = new Ponto();
        this.x = x;
        this.y = y;
        this.d = 1;
    }

    @Override
    public String desenhar() {
        return toString();
    }

    @Override
    public void move(float dx, float dy) {
        this.pRect.mover(dx, dy);
    }

    @Override
    public float calcularArea() {
        return (x * y) * d;
    }
}
