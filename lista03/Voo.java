package br.edu.fatecfranca.lista03;


public class Voo {
    private int nro;
    private String origem, destino;


    public Voo(){
    }
    public Voo(int nro, String origem, String destino){
        this.setNro(nro);
        this.setDestino(destino);
        this.setOrigem(origem);
    }

    public int getNro(){

        return nro;
    }
    public void setNro(int nro){

        this.nro = nro;
    }
    public String getOrigem(){

        return origem;
    }
    public void setOrigem(String origem){

        this.origem = origem;
    }
    public String getDestino(){

        return destino;
    }
    public void setDestino(String destino){

        this.destino = destino;
    }

    public String mostra(){
        return "Voo: " + "\nNúmero: " + this.nro + "\nOrigem: " + this.origem + "\nDestino: " + this.destino;
    }
}
