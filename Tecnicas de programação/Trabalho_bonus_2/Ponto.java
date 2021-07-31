package Trabalho_bonus_2;

public class Ponto {
    int x, y;

    public Ponto() {
        this(0);
    }

    public Ponto(int i) {
        this(i, i);
    }

    public Ponto(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    boolean igual(Ponto p) {
        return this.x == p.x && this.y == p.y;
    }

    void mover(float dx, float dy) {

    }
}
