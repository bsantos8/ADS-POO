package br.edu.fatecfranca.lista02.exe0;

public class TestaComputador {
        public static void main(String[] args){
            //criar obj
            Computador obj1 = new Computador();
            obj1.setModo(true);
            obj1.setMemoria4("4");
            obj1.setMemoria8 ("40");
            obj1.setMemoria16("20");
            obj1.setMemoria32("32");


            Computador obj2 = new Computador(true, "4", "40", "20", "32"); //passando os dados no construtor

            System.out.println("Obj2: \nModo:" + obj2.getModo() + "\nMemoria4: " +obj2.getMemoria4() + "\nMemoria8: "
                    + obj2.getMemoria8() + "\nMemoria16: " + obj2.getMemoria16() + "\nMemoria32: " + obj2.getMemoria32());
        }

    }


