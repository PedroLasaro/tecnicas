package CK235_496640_TRAB_03.Questao_2;

public class Main {
    public static void main(String[] args) {
        Sistema s = new Sistema();
        s.criarContaXTPOBasic(1);
        s.criarContaXTPOPlus(2);
        s.criarContaXTPOExtreme(3);

        for (int i = 1; i <= 3; i++) s.creditar(i, 1000);

        for (int i = 1; i <= 3; i++) s.debitar(i, 10);

        System.out.println(s.consultarSaldo(1).equals(990));
        System.out.println(s.consultarSaldo(2).equals(995));
        System.out.println(s.consultarSaldo(3).equals(992.02));

    }
}
