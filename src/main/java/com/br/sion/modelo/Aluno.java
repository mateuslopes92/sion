package com.br.sion.modelo;

public class Aluno {

    public Long aluno_ra;
    public String aluno_nome;
    public Boolean aluno_monitor;
    private int aluno_periodo;
    public String aluno_email;
    public Curso curso;
    public Usuario usuario;

    public Aluno(){}

    public Aluno(Long aluno_ra, String aluno_nome, Boolean aluno_monitor, int aluno_periodo, String aluno_email, Curso curso, Usuario usuario) {
        this.aluno_ra = aluno_ra;
        this.aluno_nome = aluno_nome;
        this.aluno_monitor = aluno_monitor;
        this.aluno_periodo = aluno_periodo;
        this.aluno_email = aluno_email;
        this.curso = curso;
        this.usuario = usuario;
    }
    
    public Long getAluno_ra() {
        return aluno_ra;
    }

    public void setAluno_ra(Long aluno_ra) {
        this.aluno_ra = aluno_ra;
    }

    public String getAluno_nome() {
        return aluno_nome;
    }

    public void setAluno_nome(String aluno_nome) {
        this.aluno_nome = aluno_nome;
    }

    public Boolean getAluno_monitor() {
        return aluno_monitor;
    }

    public void setAluno_monitor(Boolean aluno_monitor) {
        this.aluno_monitor = aluno_monitor;
    }

    public int getAluno_periodo() {
        return aluno_periodo;
    }

    public void setAluno_periodo(int aluno_periodo) {
        this.aluno_periodo = aluno_periodo;
    }
    
    public String getAluno_email() {
        return aluno_email;
    }

    public void setAluno_email(String aluno_email) {
        this.aluno_email = aluno_email;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
