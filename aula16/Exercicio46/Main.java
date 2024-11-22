package aula16.Exercicio46;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Livro 1");
        Livro livro2 = new Livro("Livro 2");
        Livro livro3 = new Livro("Livro 3");
        Livro livro4 = new Livro("Livro 4");
        Livro livro5 = new Livro("Livro 5");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.addicionarLivro(livro1);
        biblioteca.addicionarLivro(livro2);
        biblioteca.addicionarLivro(livro3);
        biblioteca.addicionarLivro(livro4);
        biblioteca.addicionarLivro(livro5);

        biblioteca.listaLivros();
    }
}
