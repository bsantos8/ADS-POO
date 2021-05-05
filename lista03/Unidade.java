package br.edu.fatecfranca.lista03;

public class Unidade {
    private String cidade;
    private String estado;


    public Unidade(){
    }

    public Unidade(String cidade, String estado){
        this.setCidade(cidade);
        this.setEstado(estado);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String Mostra() {
        return "Unidade{" +
                "Cidade='" + cidade + '\'' +
                ", Estado='" + estado + '\'' +
                '}';
    }
}


