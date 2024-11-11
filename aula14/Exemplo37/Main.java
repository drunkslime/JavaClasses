package aula14.Exemplo37;

public class Main {
    public static void main(String[] args) {
        BoloChocolate boloChocolate = new BoloChocolate(30, true);
        BoloMorango boloMorango = new BoloMorango(30, true);

        boloChocolate.confecaoBolo();
        boloMorango.confecaoBolo();

        Bolo BoloChocolate = new BoloChocolate(30, false);
        Bolo BoloMorango = new BoloMorango(30, false);
    }
}
