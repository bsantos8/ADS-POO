package br.edu.fatecfranca.lista02.exe1;

import br.edu.fatecfranca.lista02.exe0.Paciente;

public class TestaCliente {

        public static void main(String[] args) {
            //criar obj
            Cliente obj1 = new Cliente("123456-7", "1234-5", "Fulano", 0);
            obj1.depositar(1500);
            obj1.sacar(500);
            obj1.mostra();

            Cliente obj2 = new Cliente("765432-1", "5432 - 1", "Beltrano"); //passando os dados no construtor
        }
}
