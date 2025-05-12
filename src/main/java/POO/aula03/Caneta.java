package POO.aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta; // float = real
    protected int carga;
    private boolean tampada;
    // metodos
    public void status(){
        System.out.println("Uma caneta " + this.modelo + " de cor " + this.cor + " com ponta " + this.ponta + " ");
        System.out.println("Está carregada? " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! Não posso rabiscar!");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }
    public void tampar(){
        this.tampada = true; //MODIFICAR ATRIBUTO DENTRO DA PRÓPRIA CLASSE UTILIZA THIS
    }
    public void destampar(){
        this.tampada = false;
    }
}
