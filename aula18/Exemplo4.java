package aula18;

import java.util.LinkedList;

public class Exemplo4 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Mário");
        linkedList.add("Artem");
        linkedList.add("Kevin");
        linkedList.add("José");

        System.out.println("\nLista: " + linkedList);

        linkedList.addFirst("Olga");
        System.out.println("\nLista: " + linkedList);

    }
}
