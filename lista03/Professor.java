package br.edu.fatecfranca.lista03;

public class Professor {
    private String nome;
    private String cpf;
    private String titulacao;

    public Professor(){
    }
    public Professor(String nome, String cpf, String titulacao){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTitulacao(titulacao);
    }
    public String getNome(){
        return nome;
    }
    // 'final' não deixa a classe filha alterar
    public final void setNome(String nome){

        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public final void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getTitulacao(){
        return  titulacao;
    }
    public final void setTitulacao(String titulacao){
        this.titulacao = titulacao;
    }
    public String Mostra(){
        return "Professor: \nNome: " + nome + "\nCpf: " + cpf + "\nTitulação: " +titulacao ;
    }

}
