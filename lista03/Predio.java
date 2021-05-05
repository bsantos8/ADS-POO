package br.edu.fatecfranca.lista03;
//exemplo de composição
public class Predio {
    private String nome, endereco;
    //associação
    private Apto apto;

    public Predio() {
        apto = new Apto();
    }
    //perceba que nos parametros temos os pedaços do apto e não o apto inteiro
    public Predio(String nome, String endereco, int andar, int nro){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.apto = new Apto(andar, nro); //cria obj-parte dentro do obj-todo
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public final void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Apto getApto() {
        return apto;
    }

    public final void setApto(Apto apto) {
        this.apto = apto;
    }

    public String mostra() {
        return "Predio{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", apto=" + apto.mostra() +
                '}';
    }
}
