package aula8;

public class Exercicio22 {
    public static void main(String[] args) {
        MensagemDeBoasVindas();
        Menu();
    }

    public static void MensagemDeBoasVindas() {
        System.out.println("\nSeja Bem Vindo\n");
    }

    public static void Menu() {
        System.out.println("== Menu ==\n" +
                            "1 - Entradas\n" +
                            "2 - Prato Carne\n" +
                            "3 - Prato Peixe\n" +
                            "4 - Sobremesa\n" +
                            "5 - Sair\n"
                            );
    }
}
