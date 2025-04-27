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

        boolean o = true;
        if(o){
            System.out.println("É verdadeiro");
        }

        //Operadores lógicos
        // &&, ||, !

        boolean temDinheiro = true;
        boolean temTempo = true;

        if(temDinheiro && temTempo){
            System.out.println("Pode viajar");
        } else {
            System.out.println("não pode viajar");
        }

        // LOOPS - While e For
        // FOCO em FOR - repetir algo até uma condição ser atingida
        int contador = -1;
        while(contador <= 5){
            System.out.println("Contador: " + contador);
            contador++;
        } // interação = cada passagem pela estrutura do loop
        for(int i = 1; i <= 5; i++){
            System.out.println("VALOR i : " + i);
        }

        // EXEMPLOS PRÁTICOS
        // analise numerica
        int [] numeros = {1,2,3,4,5,6,7,8,9};
        int somaPar = 0;
        int somaImpar = 0;
        // como eu vou chamar a unidade da minha lista
        for(int num : numeros){
            if( num % 2 == 0){
                somaPar += num;
            }else{
                somaImpar += num;
            }
            // identificar se um número é multiplo de 3
            if( num % 3 == 0){
                System.out.println("O numero" + num + "é multiplo de 3");
            }
            if( num > 5 && num < 7){
                System.out.println("O número está entre 5 e 7" + num );
            }
        }

        System.out.println("A soma dos pares é: "+ (somaPar));
        System.out.println("A soma dos impares é: "+ (somaImpar));


        // break => ejetar o loop
        // continue => pular uma execução
        // vars temporarios dos loops, elas podem repetir o nome
        for(int i = 1; i<=10; i++ ){
            if( i == 2 ){
                continue;
            }else if (i == 5){
                break;
            }
            System.out.println("i: " + i);
        }
    }
}
