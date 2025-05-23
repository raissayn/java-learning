package POO.aula12;

public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Canguru c = new Canguru();

        m.setPeso(35.4f);
        m.setIdade(12);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();

        r.setPeso(10.5f);
        r.setIdade(10);
        r.setCorEscama("Branco");
        r.alimentar();

        c.setPeso(20.5f);
        c.locomover();
    }
}
