package br.edu.fatecfranca.lista04;

public class Assistente extends Funcionario {
    private float ValeTransporte;

    public Assistente(){
        super();
    }

    public Assistente(float ValeTransporte, String nome, String cpf, float salario) {
        super(nome, cpf, salario);
        this.setValeTransporte(ValeTransporte);
    }

    public float getValeTransporte() {
        return ValeTransporte;
    }

    public final void setValeTransporte(float valeTransporte) {
        this.ValeTransporte = valeTransporte;
    }

    @Override
    public String Mostra() {
        return "Assistente{" +
                "ValeTransporte=" + this.ValeTransporte + super.Mostra() +
                '}';
    }
}
