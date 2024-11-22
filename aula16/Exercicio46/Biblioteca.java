package aula16.Exercicio46;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Biblioteca {
    public List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }             

    public void addicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void listaLivros() {
        for (Livro livro : livros) System.out.println( livro.getTitulo() );
    }

    public void removerLivro(Livro livro) {
        try {
            this.livros.remove(livro);
        } catch (NoSuchElementException e) {
            System.out.println("Livro não encontrado!");
        }
    }
}
