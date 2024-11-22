package aula16.Exercicio45;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Maria");
        Aluno aluno = new Aluno("Vicente");
        Escola escola = new Escola();

        escola.darAulas(professor, aluno);
    }
}
