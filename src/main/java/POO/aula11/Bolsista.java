package POO.aula11;

public class Bolsista extends Aluno{
    private float bolsa;
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    // SOBREPOR MÉTODO DE PAGAR MENSALIDADE
    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de bolsista:  " + this.getNome() + " Pagamento facilitado!");
    }

    @Override
    public String toString() {
        return "Bolsista{" +
                "bolsa=" + bolsa +
                '}';
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
