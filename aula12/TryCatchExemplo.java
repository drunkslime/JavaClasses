package aula12;

public class TryCatchExemplo {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;

        try {
            novaFrase = frase.toUpperCase();
                
            System.out.println("Frase: " + frase);
            System.out.println("Nova frase: " + novaFrase);
        
        }
        catch (Exception e) {
            System.out.println("A frase é nulo");
        }
    }
}