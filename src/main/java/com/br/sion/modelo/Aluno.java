package com.br.sion.modelo;

public class Aluno {

public Long ra;
public String nome;
public Boolean monitor;
public int periodo;

public Aluno(){}

public Aluno(Long ra, String nome, Boolean monitor, int periodo){
    this.ra = ra;
    this.nome = nome;
    this.monitor = monitor;
    this.periodo = periodo;
}

    public Long getRa() {
        return ra;
    }

    public void setRa(Long ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getMonitor() {
        return monitor;
    }

    public void setMonitor(Boolean monitor) {
        this.monitor = monitor;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    @Override
    public String toString(){
        return "Aluno{" + "ra=" + ra + ", nome=" + nome + ", monitor=" + monitor + ", periodo" + periodo + '}';
    }           
}
