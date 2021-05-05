package br.edu.fatecfranca.lista03;

public class TestaP {
    public static void main(String[] args){
        Unidade obj1 = new Unidade ("Franca", "SP" );
        Cliente obj2 = new Cliente("Paulo", "123456789",, obj1);
        System.out.println(obj2.mostra());
    }
}
