package Trabalho_bonus_2;

public class Circulo extends Figura {
    float raio;

    public Circulo(Ponto centro, float raio) {
        this.pOrigem = centro;
        this.raio = raio;
    }

    public float calcularArea() {
        return (3 * (raio * raio));
    }
}
