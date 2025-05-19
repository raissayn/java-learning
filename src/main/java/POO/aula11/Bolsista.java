package POO.aula11;

public class Bolsista extends Aluno{
    private int bolsa;
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    // SOBREPOR MÉTODO DE PAGAR MENSALIDADE
    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de " + this.getNome());
    }
}
