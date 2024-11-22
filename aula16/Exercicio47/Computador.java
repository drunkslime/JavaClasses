package aula16.Exercicio47;

public class Computador {
    private CPU cpu;

    public Computador(String modeloCPU) {
        this.cpu = new CPU(modeloCPU);
    }

    public void mostrarCPU() {
        System.out.println("Computador com CPU: " + cpu.getModelo());
    }

}
