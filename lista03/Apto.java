package br.edu.fatecfranca.lista03;

public class Apto {
    private int andar, nro;

    public Apto() {
    }

    public Apto(int andar, int nro) {
        this.setAndar(andar);
        this.setNro(nro);
    }

    public int getAndar() {
        return andar;
    }

    public final void setAndar(int andar) {
        this.setAndar(andar);
    }

    public int getNro() {
        return nro;
    }

    public final void setNro(int nro) {
        this.setNro(nro);
    }

    public String mostra() {
        return "Apto{" +
                "andar=" + andar +
                ", nro=" + nro +
                '}';
    }
}
