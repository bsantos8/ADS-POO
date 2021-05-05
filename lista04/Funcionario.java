package br.edu.fatecfranca.lista04;

//superclasse ou classe pai
public class Funcionario {
    //protected ->variavel sera publica para as filhas e privada para as demais
    protected String nome, cpf;
    protected float salario;

    public Funcionario(){
    }

    public Funcionario(String nome, String cpf, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public final void setCpf(String cpf) {
        if (cpf.length() == 14){
            this.cpf = cpf;
        }else {
            System.out.println("CPF inváido");
        }
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String Mostra() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                '}';
    }
}
