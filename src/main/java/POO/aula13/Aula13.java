package POO.aula13;

public class Aula13 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        m.emitirSom();
        Lobo l = new Lobo();
        l.emitirSom();
        Cachorro c = new Cachorro();
        c.emitirSom();
// SOBRECARGA
        c.reagir("Olá");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(1, 2);
        c.reagir(2, 10);
    }
}