package aula17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Exemple1 {
    public static void main(String[] args) {
        Collection<String> nomes = new ArrayList<>();
        System.out.println("\n");

        nomes.add("Kevin");
        nomes.add("Matilde");
        nomes.add("Leticia");
        nomes.add("Joaquim");
        nomes.add("Matheus");

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println(nomes);

        System.out.println(nomes.size());

        System.out.println("Contains Kevin? " + nomes.contains("Kevin"));
        System.out.println("Contains Artem? " + nomes.contains("Artem"));

        nomes.remove("Kevin");
        System.out.println(nomes);

        System.out.println("isEmpty? " + nomes.isEmpty());

        nomes.clear();
        System.out.println("isEmpty? " + nomes.isEmpty());
    }
}
