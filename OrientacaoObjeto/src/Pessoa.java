// Implementação restrita dos atributos da classe Pessoa
public class Pessoa {

    private String nome;
    public String getNome() {
        return this.nome;
    }
    // Aperfeicoando os atributos da classe
    public void setNome(String nome) throws Exception {
        int qtdePalavras = nome.trim().split(" ").length;
        if (qtdePalavras > 1) {
            this.nome = nome;
        } else {
            throw new Exception("Nome deve ter pelo menos duas palavras.");
        }
    }


    private int idade;
    public int getIdade() {
        return this.idade;
    }
public void setIdade(int idade)throws Exception {
    if (idade >= 0 && idade <= 120) {
        this.idade = idade;
    } else {
        throw new Exception("Idade deve estar entre 0 e 120 anos.");
    }
}
    

private double salario;

    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) throws Exception {
        if (salario > 0) {
            this.salario = salario;
        } else {
            throw new Exception("O salário deve ser maior do que zero.");
        }
    }

     
    public void mostrarDados() {
        System.out.printf("%s tem %d anos de idade e recebe %f reais.\n", this.getNome(), this.getIdade(), this.getSalario());

    }

    public Pessoa() {
        this.nome = "Isa Santana";
        this.idade = 29;
        this.salario = 1000;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.idade = 40;
    }
}