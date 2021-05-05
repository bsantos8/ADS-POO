package br.edu.fatecfranca.lista04;

public class Diretor extends Funcionario {
    private String carro;

    public Diretor(){
      super();
    }

    public Diretor(String carro, String nome, String cpf, float salario) {
        super(nome, cpf, salario);
        this.setCarro(carro);
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String Mostra() {
        return "Diretor{" +
                "carro='" + carro + '\'' +
                '}';
    }
}
