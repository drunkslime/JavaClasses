package aula14.Exemplo37;

public class BoloChocolate extends Bolo{

    public BoloChocolate(int tamanho, boolean cobertura){
        super(sabor = "Chocolate", tamanho, cobertura);
    }

    @Override
    public void confecaoBolo() {
        System.out.println("Este bolo vai ser confecionado no forno.");        
    }
}
