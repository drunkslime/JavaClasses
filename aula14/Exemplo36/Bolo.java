package aula14.Exemplo36;

public abstract class Bolo {

    public static String sabor;
    public boolean cobertura;
    public int tamanho;

    public Bolo(String sabor, int tamanho, boolean cobertura) {
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.cobertura = cobertura;
    };

    public abstract void confecaoBolo();
}