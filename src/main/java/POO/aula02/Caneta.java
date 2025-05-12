package POO.aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta; // float = real
    int carga;
    boolean tampada;
    // metodos
    void status(){
        System.out.println("Uma caneta " + this.modelo + " de cor " + this.cor + " com ponta " + this.ponta + " ");
        System.out.println("Está carregada? " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! Não posso rabiscar!");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }
    void tampar(){
        this.tampada = true; //MODIFICAR ATRIBUTO DENTRO DA PRÓPRIA CLASSE UTILIZA THIS
    }
    void destampar(){
        this.tampada = false;
    }
}
