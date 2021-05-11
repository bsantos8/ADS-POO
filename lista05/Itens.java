package br.edu.fatecfranca.lista05;

public class Itens {
    private int id;
    private String descricao;
    private int qtde;
    private float preco;

    public Itens(){}

    public Itens(int id, String descricao, int qtde, float preco) {
        this.setId(id);
        this.setDescricao(descricao);
        this.setQtde(qtde);
        this.setPreco(preco);
    }

    public int getId() {
        return id;
    }

    public final void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public final void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtde() {
        return qtde;
    }

    public final void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public float getPreco() {
        return preco;
    }

    public final void setPreco(float preco) {
        this.preco = preco;
    }


    public String toString() {
        return "Itens{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", qtde=" + qtde +
                ", preco=" + preco +
                '}';
    }
}
