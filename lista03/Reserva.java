package br.edu.fatecfranca.lista03;


import java.util.Date;
//obj-todo
public class Reserva {
    private int codigo;
    private Date data;
    private float valor;
    //associação
    private Passageiro passageiro; //obj-parte
    private Voo voo; //obj- parte

    public Reserva() {
    }

    public Reserva(int codigo,Date data, float valor, Passageiro passageiro,Voo voo){
       this.setCodigo(codigo);
       this.setData(data);
       this.setValor(valor);
       this.setPassageiro(passageiro);
       this.setVoo(voo);
    }

    public int getCodigo() {
        return codigo;
    }

    public final void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public final void setData(Date data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public final void setValor(float valor) {
        this.valor = valor;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public final void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public String mostra() {
        return "Reserva{" +
                "codigo=" + this.codigo +
                ", data=" + this.data +
                ", valor=" + this.valor +
                ", passageiro=" + this.passageiro.mostra() +
                ", voo=" + this.voo.mostra() +
                '}';
    }
}
