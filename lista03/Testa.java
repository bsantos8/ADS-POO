package br.edu.fatecfranca.lista03;

public class Testa {
    public static void main(String[] args){
        Professor obj1 = new Professor ("Paulo", "123", "mestre" );
        Disciplina obj2 = new Disciplina("POO", 80, "Herança e Polimorfismo", obj1);
        System.out.println(obj2.mostra());
    }
}
