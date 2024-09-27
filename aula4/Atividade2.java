package aula4;

public class Atividade2 {

    public static void main(String[] args) {
        int v[] = {2, 0, 3, 9};
        v[v[2]] = v[v[1]];
        for (int i: v) {
            System.out.print(i);
        }
    }

}
