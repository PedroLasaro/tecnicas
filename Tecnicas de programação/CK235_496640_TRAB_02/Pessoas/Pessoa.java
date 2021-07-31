package CK235_496640_TRAB_02.Pessoas;

// Questão 3 //
class Pessoa {
    String nome;
    String idade;

    void setNome(String pnome) {
        nome = pnome;
    }

    String getNome() {
        return nome;
    }
    // fim da Questão 3 //.

    // Questão 5 //
    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    // fim da Questão 5 //

    // Questão 7 //
    public Pessoa() {
    }

    public Pessoa(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }
    // fim da Questão 7 //

    // Questão 10 //
    String getPessoa() {
        String a = "NOME:" + nome + ",IDADE:" + idade;
        return a;
    }
    // fim da Questão 10 //
}
