package aula14.Exemplo36;

public class BoloMorango extends Bolo {

    public BoloMorango(int tamanho, boolean cobertura){
        super(sabor = "Morango", tamanho, cobertura);
    }
    @Override
    public void confecaoBolo() {
        System.out.println("Este bolovai ser confecionado na lareira.");
    }
}
