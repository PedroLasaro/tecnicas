package Trabalho_bonus_2;

public class Triangulo extends Figura {
    float base, altura;

    public Triangulo(Ponto pOrigem, float base, float altura) {
        this.pOrigem = pOrigem;
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(Ponto pOrigem, float base) {
        this.pOrigem = pOrigem;
        this.base = base;
        this.altura = base;
    }

    public float calcularArea() {
        return (base * altura) / 2;
    }
}
