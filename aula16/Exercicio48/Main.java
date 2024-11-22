package aula16.Exercicio48;

public class Main {
    public static void main(String[] args) {
    
        Pessoa pessoaPedro = new Pessoa("Pedro", "20", 'M');
        Livro livroHarryPotter = new Livro("Harry Potter", "JK Rowling", 400, 0, false, pessoaPedro);

        livroHarryPotter.detalhes();

        livroHarryPotter.abrir();
        livroHarryPotter.abrir();
        livroHarryPotter.fechar();
        livroHarryPotter.fechar();

        livroHarryPotter.abrir();
        livroHarryPotter.avancarPag();
        livroHarryPotter.folhear(300);
        livroHarryPotter.voltarPag();
    }
}
