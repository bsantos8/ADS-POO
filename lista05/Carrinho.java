package br.edu.fatecfranca.lista05;

import java.util.ArrayList;
import java.util.Date;

public class Carrinho {
    private int id;
    private Date data;
    private float valor;
    private ArrayList<Itens> itens; //dentro do carrinho existe os itens

    public Carrinho(){
        this.itens = new ArrayList();
    }

    public Carrinho(int id, Date data, float valor, ArrayList<Itens> itens) {
        this.setId(id);
        this.setData(data);
        this.setValor(valor);
        this.setItens(itens);
        this.itens = new ArrayList();
    }

    public Carrinho(int i, Date date, int i1) {
    }

    //adiciona um item no carrinho
    public void adicionaItem(int id, String descricao,int qtde, float valor){
        this.itens.add(new Itens(id, descricao, qtde, valor));
    }

    public int getId() {
        return id;
    }

    public final void setId(int id) {
        this.id = id;
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

    public ArrayList<Itens> getItens() {
        return itens;
    }

    public final void setItens(ArrayList<Itens> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "id=" + id +
                ", data=" + data +
                ", valor=" + valor +
                ", itens=" + itens.toString() +
                '}'; //chama o mostra() de todos os carrinhos
    }
}
