package Trabalho_bonus_2;

public class Retangulo extends Figura {
    float ladox, ladoy;

    public Retangulo(Ponto pOrigem, int ladox, int ladoy) {
        this.pOrigem = pOrigem;
        this.ladox = ladox;
        this.ladoy = ladoy;
    }

    public Retangulo(Ponto pOrigem, int lado) {
        this.pOrigem = pOrigem;
        this.ladox = lado;
        this.ladoy = lado;
    }

    public float calcularArea() {
        return ladox * ladoy;
    }

}
