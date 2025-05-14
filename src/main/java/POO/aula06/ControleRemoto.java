package POO.aula06;

public class ControleRemoto implements ControladorInterface {
    @Override
    public void ligar() {
    this.setLigado(true);
    }

    @Override
    public void desligar() {
    this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()) {
            System.out.println(" === Menu principal ===");
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.println("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.println("|");
            }
        } else {
            System.out.println("Deve estar ligado para abrir o menu!");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu... ");
    }

    @Override
    public void maisVolume() {
    if (this.getLigado()) {
        this.setVolume(this.getVolume() + 5); // PRESTAR ATENÇÃO AQUI
    }
    }

    @Override
    public void menosVolume() {
    if (this.getLigado()){
        this.setVolume(this.getVolume() - 5);
    }
    }

    @Override
    public void ligarMudo() {
    if ( (this.getLigado()) && (this.getVolume() > 0 )){
        this.setVolume(0);
    } else {
        System.out.println("Deve estar ligado e o volume deve ser maior que zero para ser ligado!");
    }
    }

    @Override
    public void desligarMudo() {
    if ((this.getLigado()) && (this.getVolume() == 0)){
        this.setVolume(50);
    } else {
        System.out.println("Deve estar ligado e o volume deve ser zero para ser desligado!");
    }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        } else {
            System.out.println("Deve estar ligado para tocar!");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Deve estar ligado e tocando para pausar!");
        }
    }

    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos especiais
    // Construtor
    public ControleRemoto(){ //LEMBRAR QUE CONSTRUTOR NÃO RECEBE VOID
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    // GETTERS E SETTERS
    private void setVolume(int v){
        this.volume = v;
    }
    private int getVolume(){
        return this.volume;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }
    private boolean getLigado(){
        return this.ligado;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }
    private boolean getTocando(){
        return this.tocando;
    }
}
