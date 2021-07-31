package CK235_496640_TRAB_03.Questao_1;

public class Main {
    public static void main(String[] args) {

        // item d e item e
        // argumentos criados para teste
        Retangulo r1 = new Retangulo(4, 8);
        Retangulo r2 = new Retangulo(12, 30);
        Circulo c1 = new Circulo(15);
        Circulo c2 = new Circulo(22);

        // bateria de teste do toString()
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        // movimentando os ponto de origem das figuras
        r1.move(4, 9);
        r2.move(13, -8);
        c1.move(-3, 15);
        c2.move(-10, -7);

        // testando a movimentação dos pontos origens das figuras
        System.out.println(r1.pRect.getPontos());
        System.out.println(r2.pRect.getPontos());
        System.out.println(c1.pOrigem.getPontos());
        System.out.println(c2.pOrigem.getPontos());

        // testando a área das figuras
        System.out.println(r1.calcularArea());
        System.out.println(r2.calcularArea());
        System.out.println(c1.calcularArea());
        System.out.println(c2.calcularArea());
        System.out.println();

        // argumentos para teste do item f
        RetanguloColorido rc1 = new RetanguloColorido(new Ponto(1, 1), 10, "Verde");
        Circulo circ1 = new Circulo(new Ponto(2, 5), 7);

        // testando metodo mover
        rc1.move(-5, -20);
        circ1.move(15, 7);

        System.out.println(rc1.toString());
        System.out.println(circ1.toString());
        System.out.println(rc1.origem.getPontos());
        System.out.println(circ1.pOrigem.getPontos());
        System.out.println(rc1.calcularArea());
        System.out.println(circ1.calcularArea());
        System.out.println();

        // item g
        Object vetfig[] = new Object[10];
        int i = 0;

        Retangulo ra1 = new Retangulo(new Ponto(7), 9);
        Retangulo ra2 = new Retangulo(new Ponto(8, 16), 17);
        RetanguloColorido rca1 = new RetanguloColorido(new Ponto(5, 19), 22, "Azul");
        RetanguloColorido rca2 = new RetanguloColorido(new Ponto(1, -9), 72, "Amarelo");
        RetanguloColorido rca3 = new RetanguloColorido(new Ponto(-12, 3), 41, "Anil");
        Circulo ca1 = new Circulo(new Ponto(12), 3);
        Circulo ca2 = new Circulo(new Ponto(-2), 9);
        Circulo ca3 = new Circulo(new Ponto(2, -4), 15);
        CirculoColorido cca1 = new CirculoColorido(new Ponto(12), 3, "Vermelho");
        CirculoColorido cca2 = new CirculoColorido(new Ponto(12), 22, "Rosa");

        vetfig[i++] = ra1;
        vetfig[i++] = ra2;
        vetfig[i++] = rca1;
        vetfig[i++] = rca2;
        vetfig[i++] = rca3;
        vetfig[i++] = ca1;
        vetfig[i++] = ca2;
        vetfig[i++] = ca3;
        vetfig[i++] = cca1;
        vetfig[i++] = cca2;

        System.out.println();

        for (Object obj : vetfig) {
            if (obj instanceof Colorida) {
                System.out.println(((Colorida) obj).calcularArea());

            }
        }
    }
}
