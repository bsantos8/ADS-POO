package br.edu.fatecfranca.lista05;
import java.util.Random;

public class Pessoa implements ICidadao, IEleitor {
    private String rg, cpf;
    private int tituloEleitor;
    private boolean votou;

    public Pessoa(){

    }

    public Pessoa(String rg, String cpf, int tituloEleitor, boolean votou) {
        this.setRg(rg);
        this.setCpf(cpf);
        this.setTituloEleitor(tituloEleitor);
        this.setVotou();
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTituloEleitor() {
        return tituloEleitor;
    }

    public void setTituloEleitor(int tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }

    public boolean isVotou() {
        return votou;
    }

    public void setVotou(boolean votou) {
        this.votou = votou;
    }

    @Override
    public String tiraRg() {
       //vamos gerar um numero randerizado- tipo objeto "dado" da sorte
        Random random = new Random();
        int semente = random.nextInt(10); //gera numero de 0 a 9
        //converte inteiro em strig
        this.setRg(String.valueOf(semente));
        return "RG gerado com sucesso";
    }
    @Override
    public String tiraCpf() {
        //vamos gerar um numero randerizado- tipo objeto "dado" da sorte
        Random random = new Random();
        int semente = random.nextInt(10); //gera numero de 0 a 9
        //converte inteiro em strig
        this.setRg(String.valueOf(semente));
        return "CPF gerado com sucesso";
    }
    @Override
    public String vota(){
        this.setVotou(true);
        return "Votou com sucesso";
    }
    @Override
    public String tiraTitulo() {
        //vamos gerar um numero randerizado- tipo objeto "dado" da sorte
        Random random = new Random();
        int semente = random.nextInt(10); //gera numero de 0 a 9
        //converte inteiro em strig
        this.setTituloEleitor(semente);
        return "Título gerado com sucesso";
    }

    @Override
    public void setVotou() {

    }
}
