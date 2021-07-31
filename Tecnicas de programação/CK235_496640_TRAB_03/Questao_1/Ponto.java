package CK235_496640_TRAB_03.Questao_1;

// classe criada na atividade bonus 2
public class Ponto {
    float x, y;

    public Ponto() {
        this(0);
    }

    public Ponto(float i) {
        this(i, i);
    }

    public Ponto(float x, float y) {
        this.setPontos(x,y);
    }

    public void setPontos(float x,float y){
        this.x = x;
        this.y = y;
    }

    // Metodo retorna os pontos unidos
    public String getPontos() {
        return (this.x + "," + this.y);
    }

    // retorna se a classe ponto é igual a outra classe ponto
    boolean igual(Ponto p) {
        return this.x == p.x && this.y == p.y;
    }

    void mover(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }
}
