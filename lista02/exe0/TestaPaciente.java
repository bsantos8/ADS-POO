package br.edu.fatecfranca.lista02.exe0;
public class TestaPaciente {
    public static void main(String[] args){
        //criar obj
        Paciente obj1 = new Paciente();
        obj1.setNome("Joaquim Xavier"); //prevenir variaveis de mal uso(encapsulando)
        obj1.setIdade(-4);
        obj1.setPeso (400);
        obj1.setTemperatura(200);

        Paciente obj2 = new Paciente("Joaquim Xavier", -4, 400, 200); //passando os dados no construtor

        //getters() -> recupera o valor
        System.out.println("Obj2: \nNome:" + obj2.getNome() + "\nIdade: " +obj2.getIdade() + "\nPeso: "
        + obj2.getPeso() + "\nTemperatura: " + obj2.getTemperatura());
    }

}
