package br.edu.fatecfranca.lista03;

import java.util.Date;

public class PPredio {
    private int codigo;
    private Date data;

    private Cliente cliente;

    private Unidade unidade;

    public PPredio(int codigo, Date data){
        this.codigo(codigo);
        this.data(Date);
        this.cliente(cliente);
        this.unidade(unidade);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    public String Mostra() {
        return "PPredio{" +
                "codigo=" + codigo +
                ", data=" + data +
                ", cliente=" + this.cliente.Mostra() +
                ", unidade=" + this.unidade.Mostra() +
                '}';
    }
}
