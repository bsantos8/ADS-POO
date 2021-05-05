package br.edu.fatecfranca.lista02.exe1;

import java.sql.SQLOutput;

public class Cliente {
    //variaveis encapsuladas
    private String numeroConta, numeroAgencia, nome;
    private float saldo;
    //metodo construtor
    public Cliente(String s, String i, String beltrano){
    }
    //metodo construtor
    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    //metodo de instância
    //setters
    public final void setNumeroConta(String numeroConta){
        if ((numeroConta.length() == 8) && (numeroConta.charAt(6) == '-')){
            this.numeroConta = numeroConta;
        } else{
            System.out.println("Número inválido");
        }
    }
    public final void setNumeroAgencia(String numeroAgencia){
        if ((numeroAgencia.length() == 6) && (numeroAgencia.charAt(4) == '-')){
            this.numeroAgencia = numeroAgencia;
        }else {
            System.out.println("número inválido");
        }
    }
    public final void setNome(String nome){
        if (nome.length() <= 30){
            this.nome = nome;
        }else {
            System.out.println("Nome Inválido!");
        }
    }
    public final void setSaldo(float saldo){
        this.saldo = saldo;
    }
    //getters
    public String getNumeroAgencia(){
        return this.numeroAgencia;
    }
    public String getNumeroConta(){
        return this.numeroConta;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public String getNome(){
        return this.nome;
    }
    public void depositar(float x){
        this.saldo += x;
    }
    public void sacar(float x){
        if(this.saldo >= x){
            this.saldo -= x;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void mostra(){
        System.out.println("Agência: " + this.numeroAgencia + "\nConta: " + this.numeroConta + "\nNome: "
        + this.nome + "\nSaldo: " + this.saldo);
    }
}
