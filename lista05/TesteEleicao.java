package br.edu.fatecfranca.lista05;

public class TesteEleicao {
    public static void main(String[]args){
        Pessoa obj = new Pessoa();
        System.out.println(obj.tiraCpf());
        System.out.println(obj.tiraRg());
        System.out.println(obj.tiraTitulo());
        System.out.println(obj.vota());
        System.out.println(obj.toString());


    }
}
