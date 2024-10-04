package aula7;

public class Atividade20 {

    public static void main(String[] args) {
        int table[][] = { 
                            { 3051, 15, 16, 19 }, 
                            { 3052, 15, 16, 19 }, 
                            { 3053, 15, 16, 19 } 
                        };
        System.out.println("ID" + "\t" + "Science" + "\t" + "Math" + "\t" + "English");
        for (int[] row : table) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
