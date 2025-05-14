package POO.aula06;

public class Aula06 {
    public static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto();
        c1.desligar(); // getter e setter estão privados.
        c1.play();
        c1.abrirMenu();
    }
}
