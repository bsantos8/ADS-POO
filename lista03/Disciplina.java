package br.edu.fatecfranca.lista03;

public class Disciplina { //obj-todo
    private String nome;
    private int cargaHoraria;
    private String ementa;
    //agregação
    private Professor professor; //Professor é a classe e professor é a agregação

    public Disciplina() {
    }

    public Disciplina(String nome, int cargaHoraria, String ementa, Professor obj1){
        this.setNome(nome);
        this.setCargaHoraria(cargaHoraria);
        this.setProfessor(professor);
    }
    public String getNome(){

        return  nome;
    }
    public final void setNome(String nome){
        this.nome = nome;
    }
    public int getCargaHoraria(){
        return  cargaHoraria;
    }
    public final void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    public String getEmenta(){
        return ementa;
    }
    public final void setEmenta(String ementa){
        this.ementa = ementa;
    }
    public Professor getProfessor(){
        return professor;
    }
    public final void setProfessor(Professor professor){
        this.professor = professor;
    }
    public String mostra(){
        return "Disciplina: \nNome: " + this.nome + "\nCarga Horaria: "
                + this.cargaHoraria+ "\nEmenta: " + this.ementa + "\nProfessor: "
                + this.professor.Mostra();
    }
}
