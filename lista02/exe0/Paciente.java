package br.edu.fatecfranca.lista02.exe0;

public class Paciente {
    //declarar variaveis publicas
    private String nome;
    private int idade;
    private float peso, temperatura;

    public Paciente(){}

    public Paciente(String nome, int idade, float peso, float temperatura){
        this.setIdade(idade); // 'set' para manter o encapsulamento
        this.setNome(nome);
        this.setPeso(peso);
        this.setTemperatura(temperatura);
    }
    // palavra 'final' para não deixar que os métodos sejam alterados nos filhos
    public final void setNome(String nome){

        this.nome = nome;
    }
    public final void setIdade(int idade){
        if((idade >= 0) && (idade <= 120)){
            this.idade = idade;
        }else {
            System.out.println("Idade inválida");
        }
    }
    public final void setPeso(float peso){
        if((peso >= 0) && (peso <= 300)){
            this.peso = peso;
        }else{
            System.out.println("Peso Inválido");
        }
    }
    public final void setTemperatura(float temperatura){
        if ((temperatura > 0) && (temperatura <= 45)){
            this.temperatura = temperatura;
        }else{
            System.out.println("Temperatura Inválida");
        }
    }
    public String getNome(){

        return this.nome;
    }
    public int getIdade() {

        return this.idade;
    }
    public float getPeso(){

        return this.peso;
    }
    public float getTemperatura() {
        return this.temperatura;
    }
}

