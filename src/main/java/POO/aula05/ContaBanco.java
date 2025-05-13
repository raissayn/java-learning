package POO.aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    // METODOS PERSONALIZADOS
//    public void abrirConta(){
//    }
//    public void fecharConta(){
//    }
//    public void depositar(){
//    }
//    public void sacar(){
//    }
//    public void pagarMensalidade(){
//    }

    //CONSTRUTOR
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    //GETTERS E SETTERS
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return this.numConta;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return this.dono;
    }
    public void setSaldo(double s){
        this.saldo = s;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setStatus(boolean st){
        this.status = st;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void estadoAtual(){
        System.out.println("------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("------------------------------------");
    }
    public void abrirConta(String t){ // t = tipo da conta
        // não entendi as 2 linhas a seguir
        this.setTipo(t);
        this.setStatus(true);
         if ( t == "CC" ){
             this.setStatus(true);
             this.setSaldo(50);
             System.out.println("Conta criada com sucesso!");
         } else if ( t == "CP"){
             this.setStatus(true);
             this.setSaldo(150);
             System.out.println("Conta criada com sucesso!");
         } else {
             System.out.println("Erro! Conta inválida!");
         }
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Erro! Conta com dinheiro!");
        } else if (this.getSaldo() < 0){
            System.out.println("Erro! Conta em débito!");
        } else if (this.getStatus() == true){ // se o status for verdadeiro mudar para false
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        } else {
            System.out.println("A conta já está fechada.");
        }
    }
    public void depositar(double v){ // v = valor a ser depositado
        if (this.getStatus()){ // Verifica se a conta está aberta!
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito de R$" + v + " realizado com sucesso.");
        } else {
            System.out.println("Erro! Conta fechada, impossível depositar!");
        }
    }
    public void sacar(double v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque de R$" + v + " realizado com sucesso.");
            } else {
                System.out.println("Erro! Saldo insuficiente!");
            }
        } else {
            System.out.println("Erro! Conta fechada, impossível sacar!");
        }
    }
    public void pagarMensalidade(){
        int valorMensalidade = 0;
        if (this.getTipo() == "CC"){
            valorMensalidade = 12;
        } else if (this.getTipo() == "CP"){
            valorMensalidade = 20;
        }
        if (this.getStatus() == true){ //se a conta estiver aberta
            this.setSaldo(this.getSaldo() - valorMensalidade); //descontado o valor da mensalidade
            System.out.println("Mensalidade paga com sucesso por" + this.getDono());
        } else {
            System.out.println("Erro! Conta fechada, impossível pagar a mensalidade!");
        }
    }
}
