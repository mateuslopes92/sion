
package com.br.sion.modelo;

public class Curso {

    public static Curso valueOf(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Long curso_id;
    public String curso_nome;
    public int curso_periodo;
    public Disciplina disciplina_id;
    public Disciplina disciplina_nome;
    
    
    public Curso(){}

public Curso(Long curso_id, String curso_nome, int curso_periodo, Disciplina disciplina_id, Disciplina disciplina_nome){
    this.curso_id = curso_id;
    this.curso_nome = curso_nome;
    this.curso_periodo = curso_periodo;
    this.disciplina_id = disciplina_id;
    this.disciplina_nome = disciplina_nome;
}

    public Long getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(Long curso_id) {
        this.curso_id = curso_id;
    }

    public String getCurso_nome() {
        return curso_nome;
    }

    public void setCurso_nome(String curso_nome) {
        this.curso_nome = curso_nome;
    }

    public int getCurso_periodo() {
        return curso_periodo;
    }

    public void setCurso_periodo(int curso_periodo) {
        this.curso_periodo = curso_periodo;
    }

    public Disciplina getDisciplina_id() {
        return disciplina_id;
    }

    public void setDisciplina_id(Disciplina disciplina_id) {
        this.disciplina_id = disciplina_id;
    }

    public Disciplina getDisciplina_nome() {
        return disciplina_nome;
    }

    public void setDisciplina_nome(Disciplina disciplina_nome) {
        this.disciplina_nome = disciplina_nome;
    }
    @Override
    public String toString(){
        return "Curso{" + "curso id=" + curso_id + ", curso nome=" + curso_nome + ", curso periodo=" + curso_periodo + ", disciplina id=" + disciplina_id + ", disciplina nome=" + disciplina_nome + '}';
    } 
}
