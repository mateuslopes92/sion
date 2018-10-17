/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.sion.modelo;

/**
 *
 * @author mateus
 */
public class Disciplina {

    public static Disciplina valueOf(long aLong, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Long disciplina_id;
    public String disciplina_nome;
    public Curso curso_id;
    public Curso curso_nome;
    public Curso curso_periodo;
    

public Disciplina(){}

public Disciplina(Long disciplina_id, String disciplina_nome, Curso curso_periodo){
    this.disciplina_id = disciplina_id;
    this.disciplina_nome = disciplina_nome;
    this.curso_id = curso_id;
    this.curso_nome = curso_nome;
    this.curso_periodo = curso_periodo;
}

    public Disciplina(Long disciplina_id, String disciplina_nome, Long curso_id, String curso_nome, Curso curso_periodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Long getDisciplina_id() {
        return disciplina_id;
    }

    public void setDisciplina_id(Long disciplina_id) {
        this.disciplina_id = disciplina_id;
    }

    public String getDisciplina_nome() {
        return disciplina_nome;
    }

    public void setDisciplina_nome(String disciplina_nome) {
        this.disciplina_nome = disciplina_nome;
    }

    public Curso getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(Curso curso_id) {
        this.curso_id = curso_id;
    }

    public Curso getCurso_nome() {
        return curso_nome;
    }

    public void setCurso_nome(Curso curso_nome) {
        this.curso_nome = curso_nome;
    }

    public Curso getCurso_periodo() {
        return curso_periodo;
    }

    public void setCurso_periodo(Curso curso_periodo) {
        this.curso_periodo = curso_periodo;
    }


@Override
    public String toString(){
        return "Disciplina{" + "Disciplina id=" + disciplina_id + ", Disciplina nome=" + disciplina_nome + ", Curso id=" + curso_id + ", Curso nome=" + curso_nome + ", Curso periodo=" + curso_periodo + '}';
    }  
}