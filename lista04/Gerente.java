package br.edu.fatecfranca.lista04;

//subclasse ou classe filha
public class Gerente extends Funcionario {
    private float bonus;

    public Gerente(){
        super(); //chama o construtor da subclasse
    }

    public Gerente(float bonus, String nome, String cpf, float salario) {
        //reutilização de codigo
        super(nome, cpf, salario);
        this.setBonus(bonus);
    }

    public float getBonus() {
        return bonus;
    }

    public final void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public String toString() {
        return "Gerente{" +
                "bonus=" + bonus +
                '}';
    }
}
