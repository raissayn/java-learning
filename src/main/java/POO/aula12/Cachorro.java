package POO.aula12;

public class Cachorro extends Mamifero{
    @Override
    public void emitirSom() {
        System.out.println("Au Au Au");
    }
    public void enterrarOsso(){
        System.out.println("Enterrando o osso");
    }
    public void abanarRabo(){
        System.out.println("Cachorro está abanando o rabo");
    }
}
