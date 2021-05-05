package br.edu.fatecfranca.lista04;

public class Testa {

    //exemplo de polimorfismo
    public static void exemploPolimorfismo(Funcionario obj){
        System.out.println(obj.Mostra());
    }



    public static void main(String[]args){

        Gerente obj2 = new Gerente(2000, "Luiz", "123.234.345.45", 4000);
        exemploPolimorfismo(obj2);

        Assistente obj3 = new Assistente(300, "Airlene", "567.678.789.00", 2000);
        exemploPolimorfismo(obj3);

        Diretor obj4 = new Diretor("Cruze", "Davi", "012.123.234.33", 3000);
        exemploPolimorfismo(obj4);
    }
}
