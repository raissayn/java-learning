package fundamentosJava.estruturasControle;

public class ExemplosControle {
    public static void main(String[] args) {// if - else (Condicionais)
        // operadores de comparação -> x > y, a == b
        int idade = 19;

        // if -> começa a condição
        // () -> contem a condição a ser avaliada
        // {} -> corpo da condição
        if (idade >= 18) {
            System.out.println(" Você é Maior de idade");
        }

        // if -> validar se algo é verdadeiro
        // else -> executa se o if não executar
        double nota = 6.3;
        if( nota > 7 ){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }

        //else if -> intermediario do if e else
        // e ele valida um bloco também/ + dois cenários
        int hora = 14;
        if(hora < 12){
            System.out.println("Bom dia");
        } else if(hora >= 12 && hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
        // posso ter 1 ou mais else if

        // Operadores de comparação
        // = é atribuição, == é comparação
        int y =5;
        int x=10;
        System.out.println("x == y: "+ (x == y));
        System.out.println("x != y: "+ (x!=y));


    }
}
