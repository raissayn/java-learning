package POO.aula12;

public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo substâncias");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de peixe");
    }
    // metodo dentro da classe
    private void soltarBolha(){
        System.out.println("Soltando bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }
    // metodo proprio da classe
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
