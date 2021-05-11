package br.edu.fatecfranca.lista05;

import java.util.Date;

public class TestaCarrinho {
    public static void main(String[]args){
        Carrinho obj = new Carrinho(100, new Date(), 800);
        obj.adicionaItem(10, "Alcool em gel", 10, 300);
        obj.adicionaItem(11, "Marcaras", 12, 200);
        obj.adicionaItem(12, "Travesseiro", 5, 300);
        System.out.println(obj.toString());
    }
}
