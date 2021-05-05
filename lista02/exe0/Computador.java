package br.edu.fatecfranca.lista02.exe0;

public class Computador {
        private boolean modo ;
        private String memoria4;
        private String memoria8;
        private String memoria16;
        private String memoria32;

        public Computador(){
        }
        public Computador(boolean modo, String memoria4, String memoria8, String memoria16, String memoria32){
            this.setModo(modo);
            this.setMemoria4(memoria4);
            this.setMemoria8(memoria8);
            this.setMemoria16(memoria16);
            this.setMemoria32(memoria32);
        }
        public boolean getModo(){
            return modo;
        }
        public final void setModo(boolean modo){
            this.modo = modo;
        }
        public String getMemoria4(){
            return memoria4;
        }
        public final void setMemoria4(String memoria4){
            this.memoria4 = memoria4;
        }
        public String getMemoria8(){
            return  memoria8;
        }
        public final void setMemoria8(String memoria8){
            this.memoria8 = memoria8;
        }

    public String getMemoria16() {
        return memoria16;
    }

    public void setMemoria16(String memoria16) {
        this.memoria16 = memoria16;
    }

    public String getMemoria32() {
        return memoria32;
    }

    public void setMemoria32(String memoria32) {
        this.memoria32 = memoria32;
    }

    public String Mostra() {
        return "Computador{" +
                "modo=" + modo +
                ", memoria4='" + memoria4 + '\'' +
                ", memoria8='" + memoria8 + '\'' +
                ", memoria16='" + memoria16 + '\'' +
                ", memoria32='" + memoria32 + '\'' +
                '}';
    }
}

}
