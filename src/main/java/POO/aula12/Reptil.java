package POO.aula12;

public class Reptil extends Animal{
    private String corEscama;

    // metodos sobrepostos
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo vegetais");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
