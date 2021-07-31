package CK235_496640_TRAB_02.Pessoas;

class Main {
    public static void main(String[] args) {

        System.out.println("Questão 1:");
        System.out.println("Alo Mundo\n");
        // Questão 2 // Main.class criado pela compilação do Main.java

        // Questão 4//
        System.out.println("Questão 4:");
        Pessoa p1 = new Pessoa();
        p1.setNome("Ana");
        Pessoa p2 = new Pessoa();
        p2.setNome("João");
        System.out.println("Nome1:" + p1.getNome());
        System.out.println(p2.getNome()+'\n');
        // fim da Questão 4 //

        // Questão 6 //
        System.out.println("Questão 6:");
        p1.setIdade("17");
        p2.setIdade("32");
        System.out.println("Idade1:" + p1.getIdade());
        System.out.println(p2.getIdade()+'\n');
        // fim da Questão 6 //

        // Questão 8 //
        System.out.println("Questão 8:");
        Pessoa p3 = new Pessoa("Júlia", "26");
        System.out.println(p3.getNome()+" "+p3.getIdade()+'\n');
        // fim da Questão 8 //

        // Questão 9 //
        System.out.println("Questão 9:");
        p1 = p2;
        System.out.println(p1.getNome());
        System.out.println(p2.getNome());
        System.out.println(p1.getIdade());
        System.out.println(p2.getIdade()+'\n');

        // Questão 10 //
        System.out.println("Questão 10:");
        System.out.println(p3.getPessoa()+'\n');
        // fim da Questão 10 //
    }

}