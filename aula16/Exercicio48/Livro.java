package aula16.Exercicio48;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;


    public Livro(String titulo, String autor, int totalPaginas, int paginaAtual, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = paginaAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if (this.aberto) {
            System.out.println("O livro ja esta aberto.");
        }
        this.aberto = true;
        mostrarPagina();        
    }

    @Override
    public void fechar() {
        if (!this.aberto) {
            System.out.println("O livro ja esta fechado.");
        }
        this.aberto = false;                
    }

    @Override
    public void avancarPag() {
        if (!this.aberto) {
            System.out.println("O livro esta fechado.");
            return;
        }
        if (this.paginaAtual == this.totalPaginas) {
            System.out.println("O livro chegou ao final.");
            return;
        }
        this.paginaAtual++;
        mostrarPagina();
    }

    @Override
    public void voltarPag() {
        if (!this.aberto) {
            System.out.println("O livro esta fechado.");
            return;
        }
        if (this.paginaAtual == 1) {
            System.out.println("O livro chegou ao inicio.");
            return;
        }
        this.paginaAtual--;
        mostrarPagina();
    }

    @Override
    public void folhear(int page) {
        if (!this.aberto) {
            System.out.println("O livro esta fechado.");
            return;
        }
        if (page > this.totalPaginas) {
            System.out.println("A pagina inserida nao existe.");
            return;
        }
        this.paginaAtual = page;
        mostrarPagina();
    }

    private void mostrarPagina() {
        System.out.println("Pagina atual: " + this.paginaAtual);
    }

    public void detalhes() {
        System.out.println("Titulo: " + this.titulo
        + "\nAutor: " + this.autor
        + "\nTotal de paginas: " + this.totalPaginas
        + "\nPagina atual: " + this.paginaAtual
        + "\nAberto: " + this.aberto
        + "\nLeitor: " + this.leitor.getNome());
    }

}
