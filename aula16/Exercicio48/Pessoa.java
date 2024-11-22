package aula16.Exercicio48;

public class Pessoa {

    private String nome;
    private String idade;
    private Character gender;

    public Pessoa(String nome, String idade, Character gender) {
        this.nome = nome;
        this.idade = idade;
        this.gender = gender;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public Character getGender() {
        return gender;
    }

    public void fazerAniv() {
        this.idade = String.valueOf(Integer.parseInt(this.idade) + 1);
    }
    
}
