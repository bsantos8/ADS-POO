package br.edu.fatecfranca.lista03;

public class Cliente {
    private String Nome;
    private String RG;


    public Cliente(){
    }

    public Cliente(String Nome, String RG){
        this.setNome(Nome);
        this.setRG(RG);
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String Mostra() {
        return "Cliente{" +
                "Nome='" + Nome + '\'' +
                ", RG='" + RG + '\'' +
                '}';
    }
}
