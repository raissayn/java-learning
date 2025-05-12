package POO.aula04;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    public boolean tampada;

// CONSTRUTOR
   public Caneta(String m, String c, float p){
       setModelo(m);
       setCor(c);
       setPonta(p);
       this.tampar();
   }

//    public Caneta(){
//        this.tampar();
//        this.cor = "Azul";
//    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public String getCor(){
       return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Uma caneta " + this.getModelo() + " de ponta " + this.getPonta());
        System.out.println("Está tampada? " + this.tampada + " e a sua cor é " + this.cor + " ");
    }
}
