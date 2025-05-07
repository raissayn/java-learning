package fundamentosJava.poo;
// Novos objetos para poder fazer ações no programa com eles
// Interação entre objetos

// Classe -> objeto
// Molde do objeto = classe
// Cria um novo objeto = instancia

public class Pessoa {
    // atributos = caracteristicas
    private String nome;
    private int idade;
    private double altura;
    private double peso;

//    // função construtora
//    public Pessoa(){
//        this.nome = "Sem nome";
//        this.idade = 0;
//        this.altura = 0.0;
//        this.peso = 0.0;
//    } // atribuindo valores iniciais


    // função construtora com atributos
    public Pessoa(String nome, int idade, double altura, double peso){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    // Métodos -> ações
    // setters e getters
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){ //return string
        return this.nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){ // return int
        return this.idade;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return this.peso;
    }
    public double calcularIMC(){
        return this.peso / (this.altura * this.altura);
    }public String verificarClassificacaoIMC(){
        double imc = this.calcularIMC();
        if(imc < 18.5){
            return "Abaixo do peso";
        }
        if(imc >= 18.5 && imc <= 24.9){
            return "Peso normal";
        }
        if(imc >= 25 && imc <= 29.9){
            return "Sobrepeso";
        }
        if(imc >= 30 && imc <= 34.9){
            return "Obesidade grau 1";
        }
        if(imc >= 35 && imc <= 39.9){
            return "Obesidade grau 2";
        }
        return "Obesidade grau 3"; // IMC acima de 40
    }
    public String apresentar(){
        return "Nome: " + this.nome + "\nIdade: " + this.idade + "\nAltura: " + this.altura + "\nPeso: " + this.peso + "IMC: "  + this.calcularIMC();
    }
}
