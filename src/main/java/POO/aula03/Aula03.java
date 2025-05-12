
package POO.aula03;

public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); // instanciando
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f; - private
        c1.carga = 80; // protegido, mas está na classe
//      c1.tampada = true;   - private
        c1.destampar();
        c1.status();
    }
}
