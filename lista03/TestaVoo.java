package br.edu.fatecfranca.lista03;

import java.util.Calendar;
import java.util.Date;

public class TestaVoo {
    public static void main(String[] args){
        Passageiro pas1 = new Passageiro("Marcos", "123-4");
        Voo voo1 = new Voo(111, "Guarulhos", "Salvador");
        Reserva re1 = new Reserva(222, new Date(), 854.00f, pas1, voo1);

        System.out.println(re1.mostra());

        //criar data específica
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.MONTH, 3);
        calendario.set(Calendar.YEAR, 2021);
        calendario.set(Calendar.DAY_OF_MONTH, 3);

        Reserva re2 = new Reserva(133, calendario.getTime(), 154.00f, pas1, voo1);
        System.out.println(re2.mostra());
    }
}
