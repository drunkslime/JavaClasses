package aula17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exemple2 {
    public static void main(String[] args) {
        System.out.println("\n");
        List<String> nomes = new ArrayList<>();
        
        nomes.add("Kevin");
        nomes.add("Matilde");
        nomes.add("Leticia");
        nomes.add("Joaquim");
        nomes.add("Matheus");

        System.out.println(nomes);

        System.out.println("Elemento na posição 0: " + nomes.get(0));

        nomes.set(0, "Artem");
        System.out.println("Elemento na posição 0: " + nomes.get(0));

        nomes.remove(2);
        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        Collections.sort(nomes, Collections.reverseOrder());
        System.out.println(nomes);

        List<String> sublist = nomes.subList(1, 3);
        System.out.println(sublist);    
        
    }
}
