package br.edu.fatecfranca.lista03;

public class Passageiro {
    private String nome,cpf;

    public Passageiro(){
    }
    public Passageiro(String nome, String cpf){
        this.setNome(nome);
        this.setCpf(cpf);
    }

    public String getNome(){

        return nome;
    }
    public final void setNome(String nome){

        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public final void setCpf(String cpf){

        this.cpf = cpf;
    }
    public String mostra(){
        return "Passageiro: " + "\nNome: " + this.nome + "\ncpf: " + this.cpf;
   }
}
