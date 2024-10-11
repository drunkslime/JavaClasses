package aula8;

public class Atividade21 {

    public static void main(String[] args) {
        int matriz2x3[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Matriz original: ");
        for (int[] line : matriz2x3) {
            for (int number : line) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
        int matriz3x2[][] = new int[3][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz3x2[j][i] = matriz2x3[i][j];
            }
        }
        System.out.println("Matriz transposta: ");
        for (int[] line : matriz3x2) {
            for (int number : line) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
        
    }
}


