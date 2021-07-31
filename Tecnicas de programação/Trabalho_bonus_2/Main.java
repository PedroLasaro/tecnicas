package Trabalho_bonus_2;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        Ponto geral = new Ponto(0, 0);
        Figura vetfig[] = new Figura[50];
        Retangulo r1 = new Retangulo(geral, 40, 20);
        Retangulo r2 = new Retangulo(geral, 30);
        Retangulo r3 = new Retangulo(geral, 10, 5);
        Retangulo r4 = new Retangulo(geral, 70);
        Circulo c1 = new Circulo(geral, 7);
        Circulo c2 = new Circulo(geral, 5);
        Circulo c3 = new Circulo(geral, 12);
        Triangulo t1 = new Triangulo(geral, 5, 4);
        Triangulo t2 = new Triangulo(geral, 7);
        Triangulo t3 = new Triangulo(geral, 3);
        Triangulo t4 = new Triangulo(geral, 9,12);

        vetfig[i++] = r1;
        vetfig[i++] = r2;
        vetfig[i++] = c1;
        vetfig[i++] = t1;
        vetfig[i++] = t2;
        vetfig[i++] = c2;
        vetfig[i++] = c3;
        vetfig[i++] = r3;
        vetfig[i++] = r4;
        vetfig[i++] = t3;
        vetfig[i++] = t4;

        for (int x = 0; x < i; x++) {
            System.out.println(vetfig[x].calcularArea());
        }
    }
}