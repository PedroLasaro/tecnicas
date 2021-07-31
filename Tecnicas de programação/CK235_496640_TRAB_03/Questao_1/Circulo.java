package CK235_496640_TRAB_03.Questao_1;

public class Circulo extends Figura {
    Ponto pOrigem = new Ponto(0,0);

    // Item D:
    public Circulo(Ponto centro, float raio) {
        this.pOrigem = new Ponto();
        this.pOrigem = centro;
        this.x = raio;
        this.y = raio;
        this.d = (float) 3.14;
    }

    public Circulo(float raio) {
        Ponto p = new Ponto(0);
        this.pOrigem = p;
        this.x = raio;
        this.y = raio;
        this.d = 3;
    }

    @Override
    public String desenhar() {
        return toString();
    }

    @Override
    public void move(float dx, float dy) {
        if (pOrigem.x == 0 && pOrigem.y == 0) {
            pOrigem.setPontos(dx, dy);
        }
        this.pOrigem.mover(dx, dy);
    }

    @Override
    public float calcularArea() {
        return (x * y) * d;
    }

}
